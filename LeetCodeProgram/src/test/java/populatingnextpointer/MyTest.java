package populatingnextpointer;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	public List<String> traverse(TreeLinkNode root) {
		List<String> ret = new ArrayList<String>();
		if (root == null) {
			return ret;
		}
		if (root.left != null) {
			ret.addAll(traverse(root.left));
		}
		ret.add(root.val + "->" + (root.next != null ? root.next.val : "null"));
		if (root.right != null) {
			ret.addAll(traverse(root.right));
		}
		return ret;
	}

	private String print(List<String> ret) {
		return "[" + String.join(",", ret) + "]";
	}

	@Test
	public void test1() {
		s.connect(null);
		assertEquals("[]", print(traverse(null)));
	}

	@Test
	public void test2() {
		TreeLinkNode t1 = new TreeLinkNode(1);
		s.connect(t1);
		assertEquals("[1->null]", print(traverse(t1)));
	}

	@Test
	public void test3() {
		TreeLinkNode t1 = new TreeLinkNode(1);
		TreeLinkNode t2 = new TreeLinkNode(2);
		TreeLinkNode t3 = new TreeLinkNode(3);

		t1.left = t2;
		t1.right = t3;

		s.connect(t1);
		assertEquals("[2->3,1->null,3->null]", print(traverse(t1)));
	}

	@Test
	public void test4() {
		TreeLinkNode t1 = new TreeLinkNode(1);
		TreeLinkNode t2 = new TreeLinkNode(2);
		TreeLinkNode t3 = new TreeLinkNode(3);
		TreeLinkNode t4 = new TreeLinkNode(4);
		TreeLinkNode t5 = new TreeLinkNode(5);
		TreeLinkNode t6 = new TreeLinkNode(6);
		TreeLinkNode t7 = new TreeLinkNode(7);

		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		t3.right = t7;

		s.connect(t1);
		assertEquals("[4->5,2->3,5->6,1->null,6->7,3->null,7->null]", print(traverse(t1)));
	}
	
	@Test
	public void test5() {
		TreeLinkNode t1 = new TreeLinkNode(1);
		TreeLinkNode t2 = new TreeLinkNode(2);
		TreeLinkNode t3 = new TreeLinkNode(3);
		TreeLinkNode t4 = new TreeLinkNode(4);
		TreeLinkNode t5 = new TreeLinkNode(5);
		TreeLinkNode t6 = new TreeLinkNode(6);
		TreeLinkNode t7 = new TreeLinkNode(7);
		TreeLinkNode t8 = new TreeLinkNode(8);
		TreeLinkNode t9 = new TreeLinkNode(9);
		TreeLinkNode t10 = new TreeLinkNode(10);
		TreeLinkNode t11 = new TreeLinkNode(11);
		TreeLinkNode t12 = new TreeLinkNode(12);
		TreeLinkNode t13 = new TreeLinkNode(13);
		TreeLinkNode t14 = new TreeLinkNode(14);
		TreeLinkNode t15 = new TreeLinkNode(15);

		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		t3.right = t7;
		
		
		t4.left = t8;
		t4.right = t9;
		t5.left = t10;
		t5.right = t11;
		t6.left = t12;
		t6.right = t13;
		t7.left = t14;
		t7.right = t15;

		s.connect(t1);
		assertEquals("[8->9,4->5,9->10,2->3,10->11,5->6,11->12,1->null,12->13,6->7,13->14,3->null,14->15,7->null,15->null]", print(traverse(t1)));
	}
	
	//{-1,0,1,2,3,4,5,6,7,8,9,10,11,12,13}
	//{-1,#,0,1,#,2,3,4,5,#,6,7,8,9,10,11,12,13,#}
}
