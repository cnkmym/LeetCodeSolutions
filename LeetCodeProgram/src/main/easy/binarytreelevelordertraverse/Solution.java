package binarytreelevelordertraverse;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	List<List<Integer>> values;

	public List<List<Integer>> levelOrder(TreeNode root) {
		values = new ArrayList<List<Integer>>();
		if (root == null) {
			return values;
		}
		register(root, 0);
		return values;
	}

	private void register(TreeNode p, int level) {
		if (values.size() < level + 1) {
			values.add(new ArrayList<Integer>());
		}
		List<Integer> v = values.get(level);
		if (p == null) {
			// v.add(null);
		} else {
			v.add(p.val);
			if (p.left != null || p.right != null) {
				register(p.left, level + 1);
				register(p.right, level + 1);
			}
		}
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