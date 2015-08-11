package convertsortedarraytobinarysearch;

import utility.TreeNode;

public class Solution {
	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		int midIndex = nums.length / 2;
		TreeNode root = new TreeNode(nums[midIndex]);
		buildSubTree(root, true, nums, 0, midIndex - 1);
		buildSubTree(root, false, nums, midIndex + 1, nums.length - 1);
		return root;
	}

	private TreeNode buildSubTree(TreeNode parent, boolean isLeftTree, int[] nums, int fromIndex, int toIndex) {
		int nodeCount = toIndex - fromIndex + 1;
		TreeNode child = null;
		if (nodeCount <= 0) {
			return parent;
		} else if (nodeCount == 1) {
			child = new TreeNode(nums[fromIndex]);
		} else if (nodeCount == 2) {
			child = new TreeNode(nums[toIndex]);
			TreeNode grandChild = new TreeNode(nums[fromIndex]);
			child.left = grandChild;
		} else {
			int midIndex = (toIndex + fromIndex) / 2;
			child = new TreeNode(nums[midIndex]);
			buildSubTree(child, true, nums, fromIndex, midIndex - 1);
			buildSubTree(child, false, nums, midIndex + 1, toIndex);
		}

		if (isLeftTree) {
			parent.left = child;
		} else {
			parent.right = child;
		}
		return parent;
	}
}
