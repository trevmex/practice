package org.trevreport.practice;
class BinaryTreeNode<E> {

	private BinaryTreeNode<E> left, right, p;
	private E key;

	public BinaryTreeNode(BinaryTreeNode<E> p, E key) {
		this.p = p;
		this.key = key;
	}

	public BinaryTreeNode<E> getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode<E> left) {
		this.left = left;
	}

	public BinaryTreeNode<E> getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode<E> right) {
		this.right = right;
	}

	public BinaryTreeNode<E> getP() {
		return p;
	}

	public E getKey() {
		return key;
	}

}