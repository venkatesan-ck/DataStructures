package com.venky.ll;

/**
 * The Class LinkList. This class uses generics and any object instance can be
 * used with it. Uses sequential and recursive traversal mechanisms.
 *
 *
 * @author Venkatesan C K
 * @param <T>
 *            the generic type
 */
public class LinkList<T> {

	/** The first. */
	private Node first;

	/**
	 * The Class Node.
	 */
	public class Node {

		/** The data. */
		private T data;

		/** The next. */
		private Node next;

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
	 * Adds the value to this list.
	 *
	 * @param value
	 *            the value
	 */
	public void add(T value) {
		// Create a node
		Node node = new Node(value);
		if (first == null) { // Empty list
			first = node;
		} else {
			// Go to end and add
			Node tmp = first;
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = node;
		}
	}

	/**
	 * Prints the list sequentially.
	 */
	public void print() {
		Node tmp = first;
		while (tmp != null) {
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
	}

	/**
	 * Prints the reversed list recursively.
	 */
	public void printReverse() {
		recPrintRev(first);
	}

	/*
	 * Recursive print reverse.
	 *
	 * @param node the node
	 */
	private void recPrintRev(Node node) {
		if (node != null) {
			recPrintRev(node.next);
			System.out.println(node.data);
		}
	}

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		LinkList<Integer> intList = new LinkList<>();
		intList.add(10);
		intList.add(20);
		intList.add(30);
		intList.add(40);
		intList.add(50);

		intList.print();

		LinkList<String> strList = new LinkList<>();
		strList.add("Apple");
		strList.add("Mango");
		strList.add("Guava");
		strList.add("Grapes");
		strList.add("Jack Fruit");
		strList.add("Water Melon");

		strList.printReverse();

	}
}
