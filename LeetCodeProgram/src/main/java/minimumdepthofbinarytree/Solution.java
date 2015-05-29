package minimumdepthofbinarytree;

public class Solution {
	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return distanceToLeaf(root, 1);
	}

	private int distanceToLeaf(TreeNode root, int level) {
		if (root.left == null && root.right == null) {
			return level;
		}
		int length1 = (root.left != null) ? distanceToLeaf(root.left, level + 1) : Integer.MAX_VALUE;
		int length2 = (root.right != null) ? distanceToLeaf(root.right, level + 1) : Integer.MAX_VALUE;
		return Math.min(length1, length2);
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