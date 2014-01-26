package org.trevreport.practice;


public class BinaryTreeBuilder {

	public BinaryTreeBuilder() {}
	
	/*
	 *     A
	 *    / \
	 *   B   C
	 *      / \
	 *     D   E
	 *    /   / \
	 *   F   G   H
	 *  /
	 * I
	 */
	public BinaryTreeNode<String> build() {
		BinaryTreeNode<String> a = new BinaryTreeNode<String>(null, "A");
		BinaryTreeNode<String> b = new BinaryTreeNode<String>(a, "B");
		BinaryTreeNode<String> c = new BinaryTreeNode<String>(a, "C");
		BinaryTreeNode<String> d = new BinaryTreeNode<String>(c, "D");
		BinaryTreeNode<String> e = new BinaryTreeNode<String>(c, "E");
		BinaryTreeNode<String> f = new BinaryTreeNode<String>(d, "F");
		BinaryTreeNode<String> g = new BinaryTreeNode<String>(e, "G");
		BinaryTreeNode<String> h = new BinaryTreeNode<String>(e, "H");
		BinaryTreeNode<String> i = new BinaryTreeNode<String>(f, "I");
		
		a.setLeft(b);
		a.setRight(c);
		c.setLeft(d);
		c.setRight(e);
		d.setLeft(f);
		e.setLeft(g);
		e.setRight(h);
		f.setLeft(i);
		
		return a;
	}

}
