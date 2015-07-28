package validatebinarysearchtree;

import static org.junit.Assert.*;

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
		t1 = new TreeNode(6);
		t2 = new TreeNode(2);
		t3 = new TreeNode(8);
		t4 = new TreeNode(0);
		t5 = new TreeNode(4);
		t6 = new TreeNode(7);
		t7 = new TreeNode(9);
		t8 = new TreeNode(3);
		t9 = new TreeNode(5);

		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		t3.right = t7;
		t5.left = t8;
		t5.right = t9;
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

		assertTrue(s.isValidBST(t1));
		assertTrue(s.isValidBST(t3));
		assertTrue(s.isValidBST(t5));
	}

	@Test
	public void test2() {
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		t3.right = t7;
		t5.left = t9;
		t5.right = t8;

		assertFalse(s.isValidBST(t5));
	}

	@Test
	public void test3() {
		assertFalse(s.isValidBST(null));
	}

	@Test
	public void test4() {
		t1.val = Integer.MAX_VALUE;
		t1.left = t2;
		t2.val = Integer.MAX_VALUE;
		assertFalse(s.isValidBST(t1));
	}

	@Test
	public void test5() {
		t1.val = Integer.MIN_VALUE;
		t1.left = t2;
		t2.val = Integer.MIN_VALUE;
		assertFalse(s.isValidBST(t1));
	}
}
