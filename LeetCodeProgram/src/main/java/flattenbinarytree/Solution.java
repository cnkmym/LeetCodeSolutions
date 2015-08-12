package flattenbinarytree;

import utility.TreeNode;

public class Solution {
	public void flatten(TreeNode root) {
		if (root != null) {
			traverse(root, null);
		}
	}

	private TreeNode traverse(TreeNode node, TreeNode appender) {
		if (node != appender && appender != null) {
			appender.right = node;
		}
		TreeNode left = node.left;
		TreeNode right = node.right;
		node.left = null;
		node.right = null;
		TreeNode tail = node;
		if (left != null) {
			tail = traverse(left, tail);
		}
		if (right != null) {
			tail = traverse(right, tail);
		}
		return tail;
	}
}
