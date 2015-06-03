package binarytreelevelordertraverse;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
	List<List<Integer>> stack;
	int traversedLevel;

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		stack = new ArrayList<List<Integer>>();
		traversedLevel = -1;
		traverse(root, 0);
		for (int i = 0; i < stack.size() / 2; i++) {
			int j = stack.size() - i - 1;
			if (i < j) {
				List<Integer> tmp = stack.get(i);
				stack.set(i, stack.get(j));
				stack.set(j, tmp);
			}
		}
		return stack;
	}

	private void traverse(TreeNode root, int level) {
		if (root == null) {
			return;
		}
		if (traversedLevel < level) {
			stack.add(new ArrayList<Integer>());
			traversedLevel = level;
		}
		stack.get(level).add(root.val);
		traverse(root.left, level + 1);
		traverse(root.right, level + 1);
	}
}
