package binarytreelevelordertraverse;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	private String print(List<List<Integer>> src) {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for (List<Integer> list : src) {
			sb.append("[");
			for (Integer i : list) {
				sb.append(i);
				sb.append(",");
			}
			sb.append("],");
		}
		sb.append("}");
		return sb.toString();
	}

	@Test
	public void test0() {
		TreeNode p = null;
		assertEquals("{}", print(s.levelOrder(p)));
	}
	
	@Test
	public void test1() {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = new TreeNode(2);
		assertEquals("{[1,],[2,2,],}", print(s.levelOrder(p)));
	}
}
