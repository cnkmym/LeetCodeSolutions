package implementqueuusingstack;

import java.util.Stack;

public class MyQueue {
	private Stack<Integer> tmp;
	private Stack<Integer> queue = new Stack<Integer>();

	// Push element x to the back of queue.
	public void push(int x) {
		tmp = new Stack<Integer>();
		while (!queue.isEmpty()) {
			tmp.push(queue.pop());
		}
		tmp.push(x);
		queue = new Stack<Integer>();
		while (!tmp.isEmpty()) {
			queue.push(tmp.pop());
		}
	}

	// Removes the element from in front of queue.
	public void pop() {
		queue.pop();
	}

	// Get the front element.
	public int peek() {
		return queue.peek();
	}

	// Return whether the queue is empty.
	public boolean empty() {
		return queue.isEmpty();
	}
}
