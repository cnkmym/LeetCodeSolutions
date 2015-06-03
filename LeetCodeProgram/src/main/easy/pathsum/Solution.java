package pathsum;

public class Solution {
	//understanding is wrong
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}
		if (root.left == null && root.right == null) {
			// leaf node
			return root.val == sum;
		}
		if (root.left != null) {
			if (hasPathSum(root.left, sum - root.val)) {
				return true;
			}
		}
		if (root.right != null) {
			if (hasPathSum(root.right, sum - root.val)) {
				return true;
			}
		}
		return false;
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
