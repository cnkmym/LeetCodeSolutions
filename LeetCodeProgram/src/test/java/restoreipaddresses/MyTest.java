package restoreipaddresses;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	Solution s;

	@Before
	public void init() {
		s = new Solution();
	}

	private String print(List<String> ips) {
		Collections.sort(ips);
		return "[" + String.join(",", ips) + "]";
	}

	@Test
	public void test1() {
		assertEquals("[0.0.0.0]", print(s.restoreIpAddresses("0000")));
		assertEquals("[8.8.8.8]", print(s.restoreIpAddresses("8888")));
	}

	@Test
	public void test2() {
		assertEquals("[255.255.11.135,255.255.111.35]", print(s.restoreIpAddresses("25525511135")));
	}

	@Test
	public void test3() {
		assertEquals("[5.28.96.41,52.8.96.41,52.89.6.41,52.89.64.1]", print(s.restoreIpAddresses("5289641")));
	}

	@Test
	public void test4() {
		assertEquals("[0.10.0.10,0.100.1.0]", print(s.restoreIpAddresses("010010")));
	}

	@Test
	public void test5() {
		assertEquals("[1.0.10.23,1.0.102.3,10.1.0.23,10.10.2.3,101.0.2.3]", print(s.restoreIpAddresses("101023")));
	}
}
