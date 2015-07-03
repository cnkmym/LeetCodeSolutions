package binarytreeinordertraversal;

import static org.junit.Assert.*;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

import utility.TreeNode;

public class MyTest {
	Solution s;
	TreeNode n1;
	TreeNode n2;
	TreeNode n3;
	TreeNode n4;
	TreeNode n5;
	TreeNode n6;

	@Before
	public void init() {
		s = new Solution();
		n1 = new TreeNode(1);
		n2 = new TreeNode(2);
		n3 = new TreeNode(3);
		n4 = new TreeNode(4);
		n5 = new TreeNode(5);
		n6 = new TreeNode(6);
	}

	private String print(List<Integer> data) {
		return "[" + String.join(",", data.stream().map(x -> String.valueOf(x)).collect(Collectors.toList())) + "]";
	}

	@Test
	public void test1() {
		assertEquals("[1]", print(s.inorderTraversal(n1)));
	}

	@Test
	public void test2() {
		n1.right = n2;
		n2.left = n3;

		assertEquals("[1,3,2]", print(s.inorderTraversal(n1)));
	}

	@Test
	public void test3() {
		n1.left = n2;
		n1.right = n3;

		assertEquals("[2,1,3]", print(s.inorderTraversal(n1)));
	}

	@Test
	public void test4() {
		n1.left = n2;
		n2.left = n3;

		assertEquals("[3,2,1]", print(s.inorderTraversal(n1)));
	}
}
