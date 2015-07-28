package binarytreezigzag;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import utility.TreeNode;

public class Solution {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		Stack<TreeNode> nextLevel = new Stack<TreeNode>();
		List<List<Integer>> ret = new LinkedList<List<Integer>>();

		if (root == null) {
			return ret;
		}

		nextLevel.add(root);
		boolean evenLevel = true;
		while (!nextLevel.isEmpty()) {
			evenLevel = !evenLevel;
			Stack<TreeNode> currentLevel = nextLevel;
			nextLevel = new Stack<TreeNode>();
			List<Integer> values = new LinkedList<Integer>();
			while (!currentLevel.isEmpty()) {
				TreeNode node = currentLevel.pop();
				values.add(node.val);
				if (evenLevel) {
					if (node.right != null) {
						nextLevel.push(node.right);
					}
					if (node.left != null) {
						nextLevel.push(node.left);
					}
				} else {
					if (node.left != null) {
						nextLevel.push(node.left);
					}
					if (node.right != null) {
						nextLevel.push(node.right);
					}
				}

			}
			ret.add(values);
		}
		return ret;
	}
}
