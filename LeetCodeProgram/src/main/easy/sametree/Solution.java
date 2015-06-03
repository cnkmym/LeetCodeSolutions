package sametree;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class Solution {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null || q == null) {
			return p == q;
		}
		if (p.val != q.val) {
			return false;
		}
		if (!isSameTree(p.left, q.left)) {
			return false;
		}
		return isSameTree(p.right, q.right);
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
