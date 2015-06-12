package invertbinarytree;

public class Solution {
	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}
		TreeNode newRoot = new TreeNode(root.val);
		traverse(root, newRoot);
		return newRoot;
	}

	private void traverse(TreeNode src, TreeNode target) {
		if (src.left != null) {
			TreeNode copy = new TreeNode(src.left.val);
			target.right = copy;
			traverse(src.left, copy);
		}
		if (src.right != null) {
			TreeNode copy = new TreeNode(src.right.val);
			target.left = copy;
			traverse(src.right, copy);
		}
	}
}

class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int x) {
		val = x;
	}
}
