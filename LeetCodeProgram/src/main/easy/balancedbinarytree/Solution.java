package balancedbinarytree;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	Map<TreeNode, Integer> nodeDepths = new HashMap<TreeNode, Integer>();

	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}
		if (isBalanced(root.left) && isBalanced(root.right)) {
			int leftDepth = depth(root.left);
			int rightDepth = depth(root.right);
			return (Math.abs(leftDepth - rightDepth) < 2);
		} else {
			return false;
		}
	}

	private int depth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (nodeDepths.containsKey(root)) {
			return nodeDepths.get(root);
		}
		int depth = 1;
		if (root.left != null) {
			depth = Math.max(depth, 1 + depth(root.left));
		}
		if (root.right != null) {
			depth = Math.max(depth, 1 + depth(root.right));
		}
		nodeDepths.put(root, depth);
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
