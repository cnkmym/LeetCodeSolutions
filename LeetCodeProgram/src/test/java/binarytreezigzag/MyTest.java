package binarytreezigzag;

import static org.junit.Assert.*;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

import utility.TreeNode;

public class MyTest {
	Solution s;
	TreeNode t1;
	TreeNode t2;
	TreeNode t3;
	TreeNode t4;
	TreeNode t5;
	TreeNode t6;
	TreeNode t7;
	TreeNode t8;
	TreeNode t9;

	@Before
	public void init() {
		s = new Solution();
		t1 = new TreeNode(1);
		t2 = new TreeNode(2);
		t3 = new TreeNode(3);
		t4 = new TreeNode(4);
		t5 = new TreeNode(5);
		t6 = new TreeNode(6);
		t7 = new TreeNode(7);
		t8 = new TreeNode(8);
		t9 = new TreeNode(9);
	}

	private String print(List<List<Integer>> values) {
		List<String> list = values.stream().map(data -> //
				"[" + String.join(",", data.stream().map(String::valueOf).collect(Collectors.toList()))//
						+ "]"//
		).collect(Collectors.toList());
		return "{" + //
				String.join(",", list) //
				+ "}";

	}

	@Test
	public void test1() {
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		t3.right = t7;
		t5.left = t8;
		t5.right = t9;
		assertEquals("{[1],[3,2],[4,5,6,7],[9,8]}", print(s.zigzagLevelOrder(t1)));
	}

	@Test
	public void test2() {
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		t3.right = t7;
		assertEquals("{[1],[3,2],[4,5,6,7]}", print(s.zigzagLevelOrder(t1)));
		assertEquals("{[2],[5,4]}", print(s.zigzagLevelOrder(t2)));
	}
}
