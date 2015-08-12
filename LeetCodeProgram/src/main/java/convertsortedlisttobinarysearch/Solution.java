package convertsortedlisttobinarysearch;

import utility.ListNode;
import utility.TreeNode;

public class Solution {
	private CustomizedTreeNode root = null;

	public TreeNode sortedListToBST(ListNode head) {
		if (head == null){
			return null;
		}
		ListNode current = head;
		CustomizedTreeNode tail = root;
		while (current != null) {
			tail = buildTree(current.val, tail);
			current = current.next;
		}

		TreeNode newRoot = rebuildTree(root);
		return newRoot;
	}

	private TreeNode rebuildTree(CustomizedTreeNode root) {
		TreeNode ret = new TreeNode(root.value);
		if (root.left != null) {
			ret.left = rebuildTree(root.left);
		}
		if (root.right != null) {
			ret.right = rebuildTree(root.right);
		}
		return ret;
	}

	private CustomizedTreeNode buildTree(int val, CustomizedTreeNode parent) {
		CustomizedTreeNode node = new CustomizedTreeNode(val);
		if (parent == null) {
			root = node;
		} else {
			parent.right = node;
			node.parent = parent;
			CustomizedTreeNode pointer = parent;
			while (pointer != null) {
				pointer.rightDepth++;
				pointer = pointer.parent;
			}
		}
		balenceTree(node.parent);
		return node;
	}

	private void balenceTree(CustomizedTreeNode tailParent) {
		if (tailParent == null) {
			return;
		}
		CustomizedTreeNode node = tailParent;
		while (node != null) {
			if (node.rightDepth - node.leftDepth > 1) {
				CustomizedTreeNode newLeft = node;
				CustomizedTreeNode parent = node.parent;
				CustomizedTreeNode pivot = node.right;
				CustomizedTreeNode newRight = pivot.left;
				newLeft.right = newRight;
				newLeft.rightDepth = (newRight != null) ? newRight.rightDepth + 1 : 0;
				pivot.left = newLeft;
				pivot.leftDepth = newLeft.rightDepth + 1;
				pivot.parent = parent;
				if (parent != null) {
					parent.right = pivot;
					parent.rightDepth = pivot.rightDepth + 1;
					CustomizedTreeNode pointer = parent;
					while (pointer.parent != null) {
						pointer.parent.rightDepth = pointer.rightDepth + 1;
						pointer = pointer.parent;
					}
				} else {
					root = pivot;
				}
				break;
			} else {
				node = node.parent;
			}
		}
	}
}

class CustomizedTreeNode {
	int value;
	int leftDepth, rightDepth;
	CustomizedTreeNode left, right, parent;

	public CustomizedTreeNode(int value) {
		this.value = value;
	}
}
