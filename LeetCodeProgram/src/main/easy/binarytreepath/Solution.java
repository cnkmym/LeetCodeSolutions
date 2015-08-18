package binarytreepath;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

import utility.TreeNode;

public class Solution {
	private Stack<TreeNode> nodes;
	private List<String> paths;
	
	public List<String> binaryTreePaths(TreeNode root) {
		nodes = new Stack<TreeNode>();
		paths = new ArrayList<String>();
		if (root != null) {
			dsf(root);
		}
		return paths;
	}

	private void addPath() {
		String path = String.join("->", nodes.stream().map(//
				i -> String.valueOf(i.val)).collect(Collectors.toList()));
		paths.add(path);
	}

	private void dsf(TreeNode node) {
		nodes.push(node);
		if (node.left == null && node.right == null) {
			addPath();
		}
		if (node.left != null) {
			dsf(node.left);
		}
		if (node.right != null) {
			dsf(node.right);
		}
		nodes.pop();
	}
}
