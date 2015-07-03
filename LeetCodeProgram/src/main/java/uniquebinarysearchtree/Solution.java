package uniquebinarysearchtree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import utility.TreeNode;

public class Solution {
	int[] digits;
	public List<TreeNode> paths;
	public Set<String> pathSet;

	public List<TreeNode> generateTrees(int n) {
		digits = new int[n];
		paths = new ArrayList<TreeNode>();
		pathSet = new HashSet<String>();

		if (n == 0) {
			paths.add(null);
			return paths;
		}
		for (int i = 0; i < n; i++) {
			digits[i] = i + 1;
		}

		computeFullCombination(digits, 0);

		return paths;
	}

	public String print(TreeNode root) {
		TreeNode current = root;
		StringBuilder sb = new StringBuilder();
		Stack<TreeNode> waiting = new Stack<TreeNode>();
		while (current != null) {
			sb.append(current.val);
			sb.append(",");
			if (current.left != null) {
				if (current.right != null) {
					waiting.add(current.right);
				}
				current = current.left;
				continue;
			}
			if (current.right != null) {
				current = current.right;
				continue;
			}
			current = (waiting.isEmpty()) ? null : waiting.pop();
		}
		return sb.toString();
	}

	private void addAsLeftTree(TreeNode root, int val) {
		if (root.left == null) {
			TreeNode child = new TreeNode(val);
			root.left = child;
			return;
		}
		int left = root.left.val;
		if (val <= left) {
			addAsLeftTree(root.left, val);
		} else {
			addAsRightTree(root.left, val);
		}
	}

	private void addAsRightTree(TreeNode root, int val) {
		if (root.right == null) {
			TreeNode child = new TreeNode(val);
			root.right = child;
			return;
		}
		int right = root.right.val;
		if (val <= right) {
			addAsLeftTree(root.right, val);
		} else {
			addAsRightTree(root.right, val);
		}
	}

	private void checkAndMakeTree(int[] digits) {
		TreeNode root = null;
		for (int i = 0; i < digits.length; i++) {
			if (root == null) {
				root = new TreeNode(digits[i]);
				continue;
			}
			if (digits[i] <= root.val) {
				addAsLeftTree(root, digits[i]);
			} else {
				addAsRightTree(root, digits[i]);
			}
		}
		String pathString = print(root);
		if (!pathSet.contains(pathString)) {
			pathSet.add(pathString);
			paths.add(root);
		}
	}

	private void computeFullCombination(int[] digits, int from) {
		if (from == digits.length - 1) {
			checkAndMakeTree(digits);
		}
		for (int i = from; i < digits.length; i++) {
			if (i > from) {
				swap(digits, from, i);
			}
			computeFullCombination(digits, from + 1);
			if (i > from) {
				swap(digits, from, i);
			}
		}
	}

	private void swap(int[] digits, int from, int to) {
		int tmp = digits[from];
		digits[from] = digits[to];
		digits[to] = tmp;
	}

}
