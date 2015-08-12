package flattenbinarytree;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import utility.TreeNode;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();

	}

	@Test
	public void test1() throws CloneNotSupportedException {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);

		n1.left = n2;
		n1.right = n5;
		n2.left = n3;
		n2.right = n4;
		n5.right = n6;

		TreeNode tn1 = new TreeNode(1);
		TreeNode tn2 = new TreeNode(2);
		TreeNode tn3 = new TreeNode(3);
		TreeNode tn4 = new TreeNode(4);
		TreeNode tn5 = new TreeNode(5);
		TreeNode tn6 = new TreeNode(6);

		tn1.right = tn2;
		tn2.right = tn3;
		tn3.right = tn4;
		tn4.right = tn5;
		tn5.right = tn6;

		s.flatten(n1);
		assertEquals(TreeNode.print(tn1), TreeNode.print(n1));
	}
	
	@Test
	public void test2() throws CloneNotSupportedException {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);

		n1.left = n2;
		n1.right = n3;
		n3.left = n4;
		n3.right = n5;
		n4.right = n6;

		TreeNode tn1 = new TreeNode(1);
		TreeNode tn2 = new TreeNode(2);
		TreeNode tn3 = new TreeNode(3);
		TreeNode tn4 = new TreeNode(4);
		TreeNode tn5 = new TreeNode(5);
		TreeNode tn6 = new TreeNode(6);

		tn1.right = tn2;
		tn2.right = tn3;
		tn3.right = tn4;
		tn4.right = tn6;
		tn6.right = tn5;

		s.flatten(n1);
		assertEquals(TreeNode.print(tn1), TreeNode.print(n1));
	}
}
