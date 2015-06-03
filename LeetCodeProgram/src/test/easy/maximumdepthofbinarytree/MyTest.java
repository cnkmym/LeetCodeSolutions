package maximumdepthofbinarytree;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	@Test
	public void test1() {
		assertEquals(0, s.maxDepth(null));
	}

	@Test
	public void test2() {
		TreeNode root = new TreeNode(1);
		assertEquals(1, s.maxDepth(root));
	}

	@Test
	public void test3() {
		TreeNode root = new TreeNode(1);
		TreeNode c1 = new TreeNode(2);
		TreeNode c2 = new TreeNode(3);
		root.left = c1;
		root.right = c2;

		assertEquals(2, s.maxDepth(root));
	}
	
	@Test
	public void test4() {
		TreeNode root = new TreeNode(1);
		TreeNode c1 = new TreeNode(2);
		TreeNode c2 = new TreeNode(3);
		root.left = c1;
		c1.right = c2;

		assertEquals(3, s.maxDepth(root));
	}
	
	@Test
	public void test5() {
		TreeNode root = new TreeNode(1);
		TreeNode c1 = new TreeNode(2);
		TreeNode c2 = new TreeNode(3);
		root.right = c1;
		c1.right = c2;

		assertEquals(3, s.maxDepth(root));
	}
}
