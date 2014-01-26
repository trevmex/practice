package org.trevreport.practice;

public class CircularListNode<E> {
	CircularListNode<E> next;
	E value;
	
	public CircularListNode() {
		this.next = this;
	}
	
	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}

	public CircularListNode<E> getNext() {
		return next;
	}

	public void setNext(CircularListNode<E> next) {
		this.next = next;
	}
	
}
