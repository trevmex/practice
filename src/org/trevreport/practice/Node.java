package org.trevreport.practice;
class Node<E> {

	private Node<E> left, right, p;
	private E key;

	public Node(Node<E> p, E key) {
		this.p = p;
		this.key = key;
	}

	public Node<E> getLeft() {
		return left;
	}

	public void setLeft(Node<E> left) {
		this.left = left;
	}

	public Node<E> getRight() {
		return right;
	}

	public void setRight(Node<E> right) {
		this.right = right;
	}

	public Node<E> getP() {
		return p;
	}

	public E getKey() {
		return key;
	}

}