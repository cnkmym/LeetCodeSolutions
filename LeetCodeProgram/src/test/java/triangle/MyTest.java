package triangle;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	public List<List<Integer>> build(String values) {
		String[] v = values.split(";");
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
		if (!"".equals(values) && v.length > 0) {
			for (String level : v) {
				String[] value = level.split(",");
				ret.add(//
						Arrays.asList(value).stream().map(Integer::valueOf).collect(Collectors.toList()));
			}
		}
		return ret;
	}

	@Test
	public void test1() {
		assertEquals(0, s.minimumTotal(build("")));
	}

	@Test
	public void test2() {
		assertEquals(4, s.minimumTotal(build("4")));
	}

	@Test
	public void test3() {
		assertEquals(-1, s.minimumTotal(build("1;2,-2")));
	}

	@Test
	public void test4() {
		assertEquals(11, s.minimumTotal(build("2;3,4;6,5,7;4,1,8,3")));
	}

}
