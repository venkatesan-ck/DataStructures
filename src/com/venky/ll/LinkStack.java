package com.venky.ll;

/**
 * The Class LinkStack. This class uses generics and any object instance can be
 * used with it. Provides a LIFO implementation using linking.
 *
 * @author Venky
 * @param <T>
 *            the generic type
 */
public class LinkStack<T> {

	/** The stack top. */
	private Node top;

	/**
	 * The Class Node.
	 */
	public class Node {

		/** The data. */
		private T data;

		/** The previous. */
		private Node previous;

		/**
		 * Instantiates a new node.
		 *
		 * @param data
		 *            the data
		 */
		public Node(T data) {
			this.data = data;
		}
	}

	/**
	 * Pop.
	 *
	 * @return the top
	 */
	public T pop() {
		Node node = top;
		top = top.previous;
		return node.data;
	}

	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty() {
		return top == null;
	}

	/**
	 * Push value to stack.
	 *
	 * @param value
	 *            the value
	 */
	public void push(T value) {
		// Create a node
		Node node = new Node(value);
		if (top == null) { // Empty stack
			top = node;
		} else { // Make this node as top and link
			node.previous = top;
			top = node;
		}
	}

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		LinkStack<Integer> stack = new LinkStack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
