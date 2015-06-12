package invertbinarytree;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	private String print(TreeNode node) {
		StringBuilder sb = new StringBuilder();
		if (node != null) {
			traverse(node, sb);
		}
		return sb.toString();
	}

	private void traverse(TreeNode node, StringBuilder sb) {
		if (node == null) {
			return;
		}
		if (node.left != null) {
			traverse(node.left, sb);
		}
		sb.append(node.val);
		sb.append(",");
		if (node.right != null) {
			traverse(node.right, sb);
		}
	}

	@Test
	public void test1() {
		TreeNode root = null;
		assertEquals("", print(s.invertTree(root)));
	}

	@Test
	public void test2() {
		TreeNode root = new TreeNode(1);
		TreeNode n1 = new TreeNode(2);
		TreeNode n2 = new TreeNode(3);
		TreeNode n3 = new TreeNode(4);
		TreeNode n4 = new TreeNode(5);
		root.left = n1;
		n1.left = n2;
		root.right = n3;
		n3.right = n4;
		assertEquals("3,2,1,4,5,", print(root));
		assertEquals("5,4,1,2,3,", print(s.invertTree(root)));
	}

	@Test
	public void test3() {
		TreeNode root = new TreeNode(1);
		TreeNode n1 = new TreeNode(2);
		TreeNode n2 = new TreeNode(3);
		TreeNode n3 = new TreeNode(4);
		TreeNode n4 = new TreeNode(5);
		root.left = n1;
		n1.right = n2;
		root.right = n3;
		n3.left = n4;
		assertEquals("2,3,1,5,4,", print(root));
		assertEquals("4,5,1,3,2,", print(s.invertTree(root)));
	}

	@Test
	public void test4() {
		TreeNode root = new TreeNode(1);
		TreeNode n1 = new TreeNode(2);
		TreeNode n2 = new TreeNode(3);
		TreeNode n3 = new TreeNode(4);
		TreeNode n4 = new TreeNode(5);
		root.left = n1;
		n1.left = n2;
		n2.left = n3;
		n3.left = n4;
		assertEquals("5,4,3,2,1,", print(root));
		assertEquals("1,2,3,4,5,", print(s.invertTree(root)));
	}

	@Test
	public void test5() {
		TreeNode root = new TreeNode(1);
		TreeNode n1 = new TreeNode(2);
		TreeNode n2 = new TreeNode(3);
		TreeNode n3 = new TreeNode(4);
		TreeNode n4 = new TreeNode(5);
		root.right = n1;
		n1.right = n2;
		n2.right = n3;
		n3.right = n4;
		assertEquals("1,2,3,4,5,", print(root));
		assertEquals("5,4,3,2,1,", print(s.invertTree(root)));
	}
}
