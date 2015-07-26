package implementqueuusingstack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	MyQueue queue;

	@Before
	public void init() {
		queue = new MyQueue();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);
		queue.push(5);
	}

	@Test
	public void test1() {
		assertEquals(false, queue.empty());
		assertEquals(1, queue.peek());
		queue.pop();
		assertEquals(2, queue.peek());
		queue.pop();
		assertEquals(3, queue.peek());
		queue.pop();
		assertEquals(4, queue.peek());
		queue.pop();
		assertEquals(5, queue.peek());
		queue.pop();
		assertEquals(true, queue.empty());
	}

	@Test
	public void test2() {
		assertEquals(false, queue.empty());
		queue.pop();
		queue.pop();
		queue.pop();
		queue.pop();
		queue.push(1);
		assertEquals(5, queue.peek());
		queue.pop();
		assertEquals(1, queue.peek());
	}
}
