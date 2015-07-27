package lowestcommonancestor;

import utility.TreeNode;

public class Solution {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (p.val == q.val) {
			return p;
		}
		TreeNode small;
		TreeNode big;
		if (p.val > q.val) {
			small = q;
			big = p;
		} else {
			small = p;
			big = q;
		}

		// start from root
		return find(root, small, big);
	}

	private TreeNode find(TreeNode root, TreeNode small, TreeNode big) {
		if (root.val == small.val || root.val == big.val) {
			return root;
		}
		if (root.val > small.val && root.val < big.val) {
			return root;
		}
		if (root.val < small.val) {
			return find(root.right, small, big);
		} else {
			return find(root.left, small, big);
		}
	}
}
