package sametree;

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
		assertEquals(true, s.isSameTree(null, null));
	}

	@Test
	public void test2() {
		TreeNode p = new TreeNode(1);
		TreeNode q = new TreeNode(1);
		assertEquals(true, s.isSameTree(p, q));
	}

	@Test
	public void test3() {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = null;
		TreeNode q = new TreeNode(1);
		q.left = new TreeNode(2);
		q.right = null;
		assertEquals(true, s.isSameTree(p, q));
	}

	@Test
	public void test4() {
		TreeNode p = new TreeNode(1);
		p.right = new TreeNode(2);
		p.left = null;
		TreeNode q = new TreeNode(1);
		q.right = new TreeNode(2);
		q.left = null;
		assertEquals(true, s.isSameTree(p, q));
	}

	@Test
	public void test5() {
		TreeNode p = new TreeNode(1);
		p.right = new TreeNode(2);
		p.left = new TreeNode(3);
		TreeNode q = new TreeNode(1);
		q.right = new TreeNode(2);
		q.left = new TreeNode(3);
		assertEquals(true, s.isSameTree(p, q));
	}

	@Test
	public void test6() {
		TreeNode p = new TreeNode(1);
		p.right = new TreeNode(2);
		p.left = new TreeNode(3);
		TreeNode q = new TreeNode(1);
		q.right = new TreeNode(2);
		q.left = null;
		assertEquals(false, s.isSameTree(p, q));
	}
	
	@Test
	public void test7() {
		TreeNode p = new TreeNode(1);
		p.right = new TreeNode(2);
		p.left = new TreeNode(3);
		p.left.left = new TreeNode(4);
		TreeNode q = new TreeNode(1);
		q.right = new TreeNode(2);
		q.left = new TreeNode(3);
		assertEquals(false, s.isSameTree(p, q));
	}
}
