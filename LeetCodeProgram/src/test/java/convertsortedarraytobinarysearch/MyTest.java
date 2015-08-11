package convertsortedarraytobinarysearch;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import utility.TreeNode;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	private int depth(TreeNode root) {
		int leftDept = (root.left != null) ? depth(root.left) + 1 : 0;
		int rightDept = (root.right != null) ? depth(root.right) + 1 : 0;
		return Math.max(leftDept, rightDept);
	}

	private boolean isBST(TreeNode root) {
		int leftDept = (root.left != null) ? depth(root.left) + 1 : 0;
		int rightDept = (root.right != null) ? depth(root.right) + 1 : 0;
		if (Math.abs(leftDept - rightDept) > 1) {
			return false;
		}
		return true;
	}

	@Test
	public void test1() {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);

		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;

		assertEquals(true, isBST(n1));
		assertEquals(true, isBST(n2));
		assertEquals(true, isBST(n3));
		assertEquals(true, isBST(n4));
		assertEquals(true, isBST(n5));
		assertEquals(true, isBST(n6));
		assertEquals(true, isBST(n7));
	}

	@Test
	public void test2() {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);

		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;

		assertEquals(true, isBST(n1));
		assertEquals(true, isBST(n2));
		assertEquals(true, isBST(n3));
		assertEquals(true, isBST(n4));
		assertEquals(true, isBST(n5));
	}

	@Test
	public void test3() {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);

		n1.left = n2;
		n1.right = n3;
		n2.left = n4;

		assertEquals(true, isBST(n1));
		assertEquals(true, isBST(n2));
		assertEquals(true, isBST(n3));
		assertEquals(true, isBST(n4));
	}

	@Test
	public void test4() {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);

		n1.left = n2;
		n2.left = n4;

		assertEquals(false, isBST(n1));
		assertEquals(true, isBST(n2));
		assertEquals(true, isBST(n4));
	}

	@Test
	public void test5() {
		int[] nums = new int[] { 1, 2, 3, 4 };
		assertEquals(true, isBST(s.sortedArrayToBST(nums)));
	}

	@Test
	public void test6() {
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		assertEquals(true, isBST(s.sortedArrayToBST(nums)));
	}

	@Test
	public void test7() {
		int[] nums = new int[] { 1 };
		assertEquals(true, isBST(s.sortedArrayToBST(nums)));
	}

	@Test
	public void test8() {
		int[] nums = new int[] { 1, 2 };
		assertEquals(true, isBST(s.sortedArrayToBST(nums)));
	}
}
