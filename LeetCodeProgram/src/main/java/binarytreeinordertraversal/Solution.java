package binarytreeinordertraversal;

import java.util.LinkedList;
import java.util.List;

import utility.TreeNode;

public class Solution {
	private List<Integer> path;

	public List<Integer> inorderTraversal(TreeNode root) {
		path = new LinkedList<Integer>();
		traverse(root, path);
		return path;
	}

	private void traverse(TreeNode root, List<Integer> path) {
		if (root == null) {
			return;
		}
		// left branch
		if (root.left != null) {
			traverse(root.left, path);
		}
		// self
		path.add(root.val);
		// right branch
		if (root.right != null) {
			traverse(root.right, path);
		}
	}

}
