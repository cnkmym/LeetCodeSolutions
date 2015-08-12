package pathsum2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

import utility.TreeNode;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	private String print(List<List<Integer>> path) {
		List<String> list = new ArrayList<String>();
		for (List<Integer> l : path) {
			list.add(String.join(",", l.stream().map(String::valueOf).collect(Collectors.toList())));
		}
		Collections.sort(list);
		return "[" + String.join(";", list) + "]";
	}

	private String print(String[] path) {
		return "[" + String.join(";", Arrays.asList(path)) + "]";
	}

	@Test
	public void test1() {
		TreeNode n1 = new TreeNode(5);
		TreeNode n2 = new TreeNode(4);
		TreeNode n3 = new TreeNode(8);
		TreeNode n4 = new TreeNode(11);
		TreeNode n5 = new TreeNode(13);
		TreeNode n6 = new TreeNode(4);
		TreeNode n7 = new TreeNode(7);
		TreeNode n8 = new TreeNode(2);
		TreeNode n9 = new TreeNode(5);
		TreeNode n10 = new TreeNode(1);

		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		// n2.right
		n3.left = n5;
		n3.right = n6;
		n4.left = n7;
		n4.right = n8;
		// n5
		n6.left = n9;
		n6.right = n10;

		String[] exp = new String[] { "5,4,11,2", "5,8,4,5" };
		assertEquals(print(exp), print(s.pathSum(n1, 22)));
	}

	@Test
	public void test2() {
		TreeNode n1 = new TreeNode(5);
		TreeNode n2 = new TreeNode(4);
		TreeNode n3 = new TreeNode(8);
		TreeNode n4 = new TreeNode(11);
		TreeNode n5 = new TreeNode(13);
		TreeNode n6 = new TreeNode(4);
		TreeNode n7 = new TreeNode(7);
		TreeNode n8 = new TreeNode(2);
		TreeNode n9 = new TreeNode(5);
		TreeNode n10 = new TreeNode(1);

		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		// n2.right
		n3.left = n5;
		n3.right = n6;
		n4.left = n7;
		n4.right = n8;
		// n5
		n6.left = n9;
		n6.right = n10;

		String[] exp = new String[] { "5,8,4,1" };
		assertEquals(print(exp), print(s.pathSum(n1, 18)));
	}

	@Test
	public void test3() {
		TreeNode n1 = new TreeNode(-2);
		TreeNode n2 = new TreeNode(-3);

		// n1.left
		n1.right = n2;

		String[] exp = new String[] { "-2,-3" };
		assertEquals(print(exp), print(s.pathSum(n1, -5)));
	}

	@Test
	public void test4() {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(-2);
		TreeNode n3 = new TreeNode(-3);
		TreeNode n4 = new TreeNode(1);
		TreeNode n5 = new TreeNode(3);
		TreeNode n6 = new TreeNode(-2);
		//TreeNode n7 = null;
		TreeNode n8 = new TreeNode(-1);
		
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		//n3.right = n7;
		n4.left = n8;

		String[] exp = new String[] { "1,-2,1,-1" };
		assertEquals(print(exp), print(s.pathSum(n1, -1)));
	}

}
