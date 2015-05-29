package balancedbinarytree;

import static org.junit.Assert.*;

import java.util.List;

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
		assertEquals(true, s.isBalanced(p));
	}

	@Test
	public void test1() {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = new TreeNode(2);
		assertEquals(true, s.isBalanced(p));
	}

	@Test
	public void test2() {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.left.left = new TreeNode(3);
		p.right = new TreeNode(2);
		assertEquals(true, s.isBalanced(p));
	}
	
	@Test
	public void test3() {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.left.left = new TreeNode(3);
		p.right = new TreeNode(2);
		p.right.right = new TreeNode(3);
		assertEquals(true, s.isBalanced(p));
	}
	
	@Test
	public void test4() {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.left.left = new TreeNode(3);
		p.right = null;
		assertEquals(false, s.isBalanced(p));
	}
	
	@Test
	public void test5() {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.left.left = new TreeNode(3);
		p.left.left.right = new TreeNode(4);
		p.right = new TreeNode(2);
		assertEquals(false, s.isBalanced(p));
	}
}
