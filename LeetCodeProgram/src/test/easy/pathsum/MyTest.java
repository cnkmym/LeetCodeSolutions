package pathsum;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import pathsum2.Solution;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	@Test
	public void test0() {
		TreeNode p = null;
		assertEquals(false, s.hasPathSum(p, 0));
	}

	@Test
	public void test1() {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = new TreeNode(5);
		assertEquals(true, s.hasPathSum(p, 3));
		assertEquals(true, s.hasPathSum(p, 6));
		assertEquals(false, s.hasPathSum(p, 1));
	}

	@Test
	public void test2() {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(1);
		p.left.left = new TreeNode(3);
		p.right = new TreeNode(2);
		assertEquals(false, s.hasPathSum(p, 2));
		assertEquals(true, s.hasPathSum(p, 3));
		assertEquals(true, s.hasPathSum(p, 5));
	}

	@Test
	public void test3() {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.left.left = new TreeNode(3);
		p.right = new TreeNode(-10);
		p.right.right = new TreeNode(6);
		assertEquals(true, s.hasPathSum(p, 6));
		assertEquals(true, s.hasPathSum(p, -3));
	}
}
