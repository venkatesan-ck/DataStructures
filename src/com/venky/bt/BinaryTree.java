package com.venky.bt;

/**
 * The Class BinaryTree. This class uses generics and any Comparable instance
 * can be used with it. Uses recursive insertion and traversal mechanisms.
 *
 * @author Venkatesan C K
 * @param <T>
 *            the generic type
 */
public class BinaryTree<T extends Comparable<T>> {

	/** The root. */
	private Node root;

	/**
	 * The Class Node.
	 */
	public class Node {

		/** The data. */
		private T data;

		/** The left. */
		private Node left;

		/** The right. */
		private Node right;

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
	 * The Enum TraversalOrder.
	 */
	public enum TraversalOrder {

		/** The pre order. */
		PRE_ORDER,
		/** The in order. */
		IN_ORDER,
		/** The post order. */
		POST_ORDER
	}

	/**
	 * Adds the value to tree.
	 *
	 * @param value
	 *            the value
	 */
	public void add(T value) {
		root = recAdd(root, value);
	}

	/*
	 * Recursive add.
	 *
	 * @param root the root
	 * 
	 * @param data the data
	 * 
	 * @return the node
	 */
	private Node recAdd(Node root, T data) {
		// Create a node
		Node node = new Node(data);
		if (root == null) { // If empty tree
			root = node;
		} else {
			if (data.compareTo(root.data) < 0) { // Go left
				root.left = recAdd(root.left, data);
			} else { // Go right
				root.right = recAdd(root.right, data);
			}
		}
		return root;
	}

	/**
	 * Prints the tree.
	 *
	 * @param order
	 *            the order
	 */
	public void print(TraversalOrder order) {
		switch (order) {
		case IN_ORDER:
			recPrintInOrder(root);
			break;
		case POST_ORDER:
			recPrintPostOrder(root);
			break;
		case PRE_ORDER:
			recPrintPreOrder(root);
			break;
		default:
			break;
		}
	}

	/*
	 * Recursive print in order.
	 *
	 * @param node the node
	 */
	private void recPrintInOrder(Node node) {
		if (node != null) {
			recPrintInOrder(node.left);
			System.out.println(node.data);
			recPrintInOrder(node.right);
		}
	}

	/*
	 * Recursive print pre order.
	 *
	 * @param node the node
	 */
	private void recPrintPreOrder(Node node) {
		if (node != null) {
			System.out.println(node.data);
			recPrintPreOrder(node.left);
			recPrintPreOrder(node.right);
		}
	}

	/*
	 * Recursive print post order.
	 *
	 * @param node the node
	 */
	private void recPrintPostOrder(Node node) {
		if (node != null) {
			recPrintPostOrder(node.left);
			recPrintPostOrder(node.right);
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
		BinaryTree<Integer> intTree = new BinaryTree<>();
		intTree.add(10);
		intTree.add(30);
		intTree.add(20);
		intTree.add(40);
		intTree.add(50);

		intTree.print(TraversalOrder.IN_ORDER);

		BinaryTree<String> strTree = new BinaryTree<>();
		strTree.add("Apple");
		strTree.add("Mango");
		strTree.add("Grapes");
		strTree.add("Jack Fruit");
		strTree.add("Water Melon");
		strTree.add("Guava");

		strTree.print(TraversalOrder.IN_ORDER);
	}
}
