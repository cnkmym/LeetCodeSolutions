package populatingnextpointer;

public class Solution {
	public void connect(TreeLinkNode root) {
		if (root != null) {
			wfs(root, null);
		}
	}

	private void wfs(TreeLinkNode node, TreeLinkNode next) {
		if (node.left != null) {
			node.left.next = node.right;
			node.right.next = getNext(next);
			wfs(node.left, node.right);
			wfs(node.right, getNext(next));
		}
	}
	
	private TreeLinkNode getNext(TreeLinkNode node){
		if (node == null){
			return node;
		}
		return node.left;
	}
}

class TreeLinkNode {
	int val;
	TreeLinkNode left;
	TreeLinkNode right;
	TreeLinkNode next;

	public TreeLinkNode(int val) {
		this.val = val;
	}
}
