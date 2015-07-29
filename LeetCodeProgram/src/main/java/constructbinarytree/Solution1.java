package constructbinarytree;

import utility.TreeNode;

public class Solution1 {

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if (preorder.length == 0) {
			return null;
		}

		int[] posInPreorder = new int[inorder.length];
		for (int i = 0; i < inorder.length; i++) {
			posInPreorder[i] = find(inorder[i], preorder);
		}

		int rangeStart = 0;
		int rangeEnd = inorder.length - 1;
		TreeNode root = makeTree(rangeStart, rangeEnd, posInPreorder, inorder);

		return root;
	}

	private TreeNode makeTree(int rangeStart, int rangeEnd, int[] posInPreorder, int[] inorder) {
		int rootIndex = findMin(rangeStart, rangeEnd, posInPreorder);
		TreeNode root = new TreeNode(inorder[rootIndex]);
		if (rootIndex > rangeStart) {
			// still has left children tree
			root.left = makeTree(rangeStart, rootIndex - 1, posInPreorder, inorder);
		}
		if (rootIndex < rangeEnd) {
			// still has right children tree
			root.right = makeTree(rootIndex + 1, rangeEnd, posInPreorder, inorder);
		}
		return root;
	}

	private int find(int target, int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}

	private int findMin(int startPos, int endPos, int[] array) {
		int ret = startPos;
		int value = array[ret];
		for (int i = startPos + 1; i <= endPos; i++) {
			if (array[i] < value) {
				value = array[i];
				ret = i;
			}
		}
		return ret;
	}
}
