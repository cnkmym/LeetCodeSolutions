package binarytreepath;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import utility.TreeNode;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	private String join(List<String> strs) {
		Collections.sort(strs);
		return "[" + String.join(";", strs) + "]";
	}

	@Test
	public void test1() {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n5 = new TreeNode(5);

		n1.left = n2;
		n1.right = n3;
		n2.right = n5;
		
		assertEquals("[1->2->5;1->3]",join(s.binaryTreePaths(n1)));

	}
	
	@Test
	public void test2() {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n5 = new TreeNode(5);

		n1.left = n2;
		n1.right = n3;
		n3.right = n5;
		
		assertEquals("[1->2;1->3->5]",join(s.binaryTreePaths(n1)));

	}
	
	@Test
	public void test3() {
		TreeNode n1 = new TreeNode(1);
		
		assertEquals("[1]",join(s.binaryTreePaths(n1)));

	}
}
