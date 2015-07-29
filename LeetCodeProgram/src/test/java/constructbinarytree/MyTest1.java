package constructbinarytree;

import static org.junit.Assert.assertArrayEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import utility.TreeNode;

public class MyTest1 {
	Solution1 s1;
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
		s1 = new Solution1();
		t1 = new TreeNode(1);
		t2 = new TreeNode(2);
		t3 = new TreeNode(3);
		t4 = new TreeNode(4);
		t5 = new TreeNode(5);
		t6 = new TreeNode(6);
		t7 = new TreeNode(7);
		t8 = new TreeNode(8);
		t9 = new TreeNode(9);
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
		
		List<Integer> preorder = new LinkedList<Integer>();
		preTraverse(t1, preorder);
		List<Integer> inorder = new LinkedList<Integer>();
		inTraverse(t1, inorder);

		TreeNode g = s1.buildTree(toArray(preorder), toArray(inorder));
		List<Integer> exp = new LinkedList<Integer>();
		postTraverse(t1, exp);
		List<Integer> actual = new LinkedList<Integer>();
		postTraverse(g, actual);

		assertArrayEquals(toArray(exp), toArray(actual));
	}

	private int[] toArray(List<Integer> list) {
		int[] d = new int[list.size()];
		int index = 0;
		for (Integer i : list) {
			d[index++] = i;
		}
		return d;
	}

	private void preTraverse(TreeNode node, List<Integer> list) {
		list.add(node.val);
		if (node.left != null) {
			preTraverse(node.left, list);
		}
		if (node.right != null) {
			preTraverse(node.right, list);
		}
	}

	private void inTraverse(TreeNode node, List<Integer> list) {
		if (node.left != null) {
			inTraverse(node.left, list);
		}
		list.add(node.val);
		if (node.right != null) {
			inTraverse(node.right, list);
		}
	}

	private void postTraverse(TreeNode node, List<Integer> list) {
		if (node.left != null) {
			postTraverse(node.left, list);
		}
		if (node.right != null) {
			postTraverse(node.right, list);
		}
		list.add(node.val);
	}
}
