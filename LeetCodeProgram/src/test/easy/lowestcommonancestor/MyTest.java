package lowestcommonancestor;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import utility.TreeNode;

public class MyTest {
	Solution s;
	TreeNode root;

	@Before
	public void init() {
		s = new Solution();
		TreeNode t1 = new TreeNode(6);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(8);
		TreeNode t4 = new TreeNode(0);
		TreeNode t5 = new TreeNode(4);
		TreeNode t6 = new TreeNode(7);
		TreeNode t7 = new TreeNode(9);
		TreeNode t8 = new TreeNode(3);
		TreeNode t9 = new TreeNode(5);

		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		t3.right = t7;
		t5.left = t8;
		t5.right = t9;

		root = t1;
	}

	@Test
	public void test1() {
		TreeNode small = new TreeNode(2);
		TreeNode big = new TreeNode(8);
		assertEquals(6, s.lowestCommonAncestor(root, small, big).val);
		assertEquals(6, s.lowestCommonAncestor(root, big, small).val);
	}

	@Test
	public void test2() {
		TreeNode small = new TreeNode(2);
		TreeNode big = new TreeNode(4);
		assertEquals(2, s.lowestCommonAncestor(root, small, big).val);
		assertEquals(2, s.lowestCommonAncestor(root, big, small).val);
	}

	@Test
	public void test3() {
		TreeNode small = new TreeNode(3);
		TreeNode big = new TreeNode(0);
		assertEquals(2, s.lowestCommonAncestor(root, small, big).val);
		assertEquals(2, s.lowestCommonAncestor(root, big, small).val);
	}
}
