package symmetrictree;

public class Solution {
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}
		return isSymmetric(root.left, root.right);
	}

	private boolean isSymmetric(TreeNode p, TreeNode q) {
		if (p == null || q == null) {
			return p == q;
		}
		if (p.val != q.val) {
			return false;
		}
		if (!isSymmetric(p.left, q.right)) {
			return false;
		}
		return isSymmetric(p.right, q.left);
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