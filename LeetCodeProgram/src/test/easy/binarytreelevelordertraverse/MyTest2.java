package binarytreelevelordertraverse;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MyTest2 {
	Solution2 s;

	@Before
	public void init() {
		s = new Solution2();
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
		assertEquals("{}", print(s.levelOrderBottom(p)));
	}
	
	@Test
	public void test1() {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = new TreeNode(2);
		assertEquals("{[2,2,],[1,],}", print(s.levelOrderBottom(p)));
	}
}
