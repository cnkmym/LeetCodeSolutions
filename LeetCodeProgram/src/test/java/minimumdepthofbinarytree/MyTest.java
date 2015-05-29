package minimumdepthofbinarytree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	@Test
	public void test0() {
		TreeNode p = null;
		assertEquals(0, s.minDepth(p));
	}

	@Test
	public void test1() {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = new TreeNode(2);
		assertEquals(2, s.minDepth(p));
	}

	@Test
	public void test2() {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.left.left = new TreeNode(3);
		p.right = new TreeNode(2);
		assertEquals(2, s.minDepth(p));
	}

	@Test
	public void test3() {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.left.left = new TreeNode(3);
		p.right = new TreeNode(2);
		p.right.right = new TreeNode(3);
		assertEquals(3, s.minDepth(p));
	}

	@Test
	public void test4() {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.left.left = new TreeNode(3);
		p.right = null;
		assertEquals(3, s.minDepth(p));
	}

	@Test
	public void test5() {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.left.left = new TreeNode(3);
		p.left.left.right = new TreeNode(4);
		p.right = new TreeNode(2);
		assertEquals(2, s.minDepth(p));
	}
}
