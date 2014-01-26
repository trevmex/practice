package org.trevreport.practice;

public class CircularListBuilder<E> {
	
	public CircularListNode<E> head;

	public CircularListBuilder() {
		this.head = new CircularListNode<E>();
	}

	public CircularListNode<E> build(E[] arr) {
		CircularListNode<E> list = head;

		list.setValue(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			list = addNode(list, arr[i]);
		}
		
		return head;
	}

	private CircularListNode<E> addNode(CircularListNode<E> list, E i) {
		CircularListNode<E> next = new CircularListNode<E>();
		
		list.setNext(next);
		next.setValue(i);
		next.setNext(head);
		
		return next;
	}

}