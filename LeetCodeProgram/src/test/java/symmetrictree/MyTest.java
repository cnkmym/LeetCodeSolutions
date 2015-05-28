package symmetrictree;

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
	public void test1() {
		assertEquals(true, s.isSymmetric(null));
	}

	@Test
	public void test2() {
		TreeNode p = new TreeNode(1);
		assertEquals(true, s.isSymmetric(p));
	}

	@Test
	public void test3() {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = new TreeNode(2);
		assertEquals(true, s.isSymmetric(p));
	}

	@Test
	public void test4() {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.left.left = null;
		p.left.right = new TreeNode(3);
		p.right = new TreeNode(2);
		p.right.left = new TreeNode(3);
		p.right.right = null;
		assertEquals(true, s.isSymmetric(p));
	}

	@Test
	public void test5() {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.left.left = new TreeNode(21);
		p.left.right = new TreeNode(3);
		p.right = new TreeNode(2);
		p.right.left = new TreeNode(3);
		p.right.right = new TreeNode(21);
		assertEquals(true, s.isSymmetric(p));
	}

	@Test
	public void test6() {
		TreeNode p = new TreeNode(1);
		p.right = new TreeNode(2);
		p.left = new TreeNode(3);
		assertEquals(false, s.isSymmetric(p));
	}

	@Test
	public void test7() {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.left.left = new TreeNode(21);
		p.left.right = new TreeNode(3);
		p.right = new TreeNode(2);
		p.right.left = new TreeNode(3);
		p.right.right = new TreeNode(20);
		assertEquals(false, s.isSymmetric(p));
	}
}
