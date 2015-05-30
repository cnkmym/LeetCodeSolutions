package compareversionnumbers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	@Test
	public void test1() {
		String version1 = "1";
		String version2 = "2";
		assertEquals(-1, s.compareVersion(version1, version2));
	}

	@Test
	public void test11() {
		String version1 = "1.1";
		String version2 = "1";
		assertEquals(1, s.compareVersion(version1, version2));
	}

	@Test
	public void test12() {
		String version1 = "1.0";
		String version2 = "1";
		assertEquals(0, s.compareVersion(version1, version2));
	}

	@Test
	public void test13() {
		String version1 = "1.0.1";
		String version2 = "1";
		assertEquals(1, s.compareVersion(version1, version2));
	}

	@Test
	public void test2() {
		String version1 = "1.1";
		String version2 = "2";
		assertEquals(-1, s.compareVersion(version1, version2));
	}

	@Test
	public void test3() {
		String version1 = "1.1";
		String version2 = "1.2";
		assertEquals(-1, s.compareVersion(version1, version2));
	}

	@Test
	public void test4() {
		String version1 = "1.4";
		String version2 = "1.12";
		assertEquals(-1, s.compareVersion(version1, version2));
	}

	@Test
	public void test5() {
		assertEquals(-1, s.compareVersion("0.1", "0.11"));
		assertEquals(-1, s.compareVersion("0.11", "1.1"));
		assertEquals(-1, s.compareVersion("1.1", "1.11"));
		assertEquals(-1, s.compareVersion("1.2", "13.37"));
	}
}
