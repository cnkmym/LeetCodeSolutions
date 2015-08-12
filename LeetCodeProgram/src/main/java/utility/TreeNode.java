package utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int x) {
		val = x;
	}

	public static String print(TreeNode p) throws CloneNotSupportedException {
		if (p == null) {
			return "";
		}
		
		List<String> ret = new ArrayList<String>();

		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(p);
		TreeNode nullNode = new TreeNode(Integer.MIN_VALUE);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			if (node != nullNode) {
				ret.add("" + node.val);
				if (node.left != null) {
					stack.push(node.left);
				}
				if (node.right != null) {
					stack.push(node.right);
				}
			} else {
				ret.add("#");
			}
		}

		return String.join(",", ret);
	}
}
