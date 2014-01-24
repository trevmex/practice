package org.trevreport.practice;
import java.util.TreeMap;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedMap;

public class BinaryTreePrinter<E> {

	private Node<E> tree;
	
	public BinaryTreePrinter(Node<E> tree) {
		this.tree = tree;
	}

	public void printDepthFirst() {
		recursePrintDepthFirst(tree);
		System.out.print("\n");
	}
	
	public void printBreadthFirst() {
		SortedMap<Integer, List<Node<E>>> map = new TreeMap<Integer, List<Node<E>>>();
		
		buildBreadthFirstMap(tree, 0, map);
		printBreadthFirstMap(map);
	}	

	private void recursePrintDepthFirst(Node<E> n) {
		if (n != null) {
			System.out.print(n.getKey().toString());
			recursePrintDepthFirst(n.getLeft());
			recursePrintDepthFirst(n.getRight());
		}
	}
	
	private void buildBreadthFirstMap(Node<E> n, int level, SortedMap<Integer, List<Node<E>>> map) {
		if (n != null) {
			List<Node<E>> list = map.get(level);
			
			if (list == null) {
				list = new LinkedList<Node<E>>();
			}
			list.add(n);
			map.put(level, list);
			
			if (n.getLeft() != null) {
				buildBreadthFirstMap(n.getLeft(), level + 1, map);
			}
			if (n.getRight() != null) {
				buildBreadthFirstMap(n.getRight(), level + 1, map);
			}
		}
	}
	
	private void printBreadthFirstMap(SortedMap<Integer, List<Node<E>>> map) {
		for (List<Node<E>> list : map.values()) {
			for (Node<E> n : list) {
				System.out.print(n.getKey().toString());
			}
			System.out.print("\n");
		}
	}
	
}
