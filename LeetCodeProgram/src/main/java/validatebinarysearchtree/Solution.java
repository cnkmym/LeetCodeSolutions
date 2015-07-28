package validatebinarysearchtree;

import utility.TreeNode;

public class Solution {
	public boolean isValidBST(TreeNode root) {
		if (root == null) {
			return true;
		}
		return validateSubTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean validateSubTree(TreeNode root, int min, int max) {
		if (root.val < min) {
			return false;
		}
		if (root.val > max) {
			return false;
		}
		if (root.left != null && root.val == Integer.MIN_VALUE) {
			return false;
		}
		if (root.left != null && !validateSubTree(root.left, min, root.val - 1)) {
			return false;
		}
		if (root.right != null && root.val == Integer.MAX_VALUE) {
			return false;
		}
		if (root.right != null && !validateSubTree(root.right, root.val + 1, max)) {
			return false;
		}
		return true;
	}
}
