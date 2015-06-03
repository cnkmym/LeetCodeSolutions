package maximumdepthofbinarytree;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class Solution {
	public int maxDepth(TreeNode root) {
		// naive method
		// DFS ?
		if (root == null) {
			return 0;
		}
		int depth = 1;
		if (root.left != null) {
			depth = Math.max(depth, maxDepth(root.left) + 1);
		}
		if (root.right != null) {
			depth = Math.max(depth, maxDepth(root.right) + 1);
		}
		return depth;
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
