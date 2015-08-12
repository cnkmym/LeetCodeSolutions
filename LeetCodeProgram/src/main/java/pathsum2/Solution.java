package pathsum2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import utility.TreeNode;

public class Solution {
	List<List<Integer>> paths;
	Stack<Integer> way;

	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		paths = new ArrayList<List<Integer>>();
		way = new Stack<Integer>();
		if (root == null) {
			return paths;
		}
		dfs(root, sum, way);
		return paths;
	}

	private void dfs(TreeNode root, int remain, Stack<Integer> way) {
		// if (remain < root.val) {
		// return;
		// }
		if (remain == root.val && root.left == null && root.right == null) {
			way.push(root.val);
			paths.add(print(way));
			way.pop();
		} else {
			way.push(root.val);
			int amount = remain - root.val;
			if (root.left != null) {
				dfs(root.left, amount, way);
			}
			if (root.right != null) {
				dfs(root.right, amount, way);
			}
			way.pop();
		}

	}

	private List<Integer> print(Stack<Integer> tail) {
		Stack<Integer> second = (Stack<Integer>) tail.clone();
		Stack<Integer> third = new Stack<Integer>();
		while (!second.isEmpty()) {
			third.push(second.pop());
		}
		List<Integer> ret = new ArrayList<Integer>();
		while (!third.isEmpty()) {
			ret.add(third.pop());
		}
		return ret;
	}
}
