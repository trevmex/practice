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
	public Node<String> build() {
		Node<String> a = new Node<String>(null, "A");
		Node<String> b = new Node<String>(a, "B");
		Node<String> c = new Node<String>(a, "C");
		Node<String> d = new Node<String>(c, "D");
		Node<String> e = new Node<String>(c, "E");
		Node<String> f = new Node<String>(d, "F");
		Node<String> g = new Node<String>(e, "G");
		Node<String> h = new Node<String>(e, "H");
		Node<String> i = new Node<String>(f, "I");
		
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
