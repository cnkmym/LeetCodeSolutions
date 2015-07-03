package uniquebinarysearchtree;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	private String print(Set<String> data) {
		List<String> list = new ArrayList<String>(data.size());
		list.addAll(data);
		Collections.sort(list);
		return "[" + String.join(";", list) + "]";
	}

	@Test
	public void test0() {
		s.generateTrees(0);
		assertEquals("[]", print(s.pathSet));
	}
	
	@Test
	public void test1() {
		s.generateTrees(1);
		assertEquals("[1,]", print(s.pathSet));
	}

	@Test
	public void test2() {
		s.generateTrees(2);
		assertEquals("[1,2,;2,1,]", print(s.pathSet));
	}

	@Test
	public void test3() {
		s.generateTrees(3);
		assertEquals("[1,2,3,;1,3,2,;2,1,3,;3,1,2,;3,2,1,]", print(s.pathSet));
	}
	
	@Test
	public void test4() {
		s.generateTrees(4);
		assertEquals("[1,2,3,4,;1,2,4,3,;1,3,2,4,;1,4,2,3,;1,4,3,2,;2,1,3,4,;2,1,4,3,;3,1,2,4,;3,2,1,4,;4,1,2,3,;4,1,3,2,;4,2,1,3,;4,3,1,2,;4,3,2,1,]", print(s.pathSet));
	}
}
