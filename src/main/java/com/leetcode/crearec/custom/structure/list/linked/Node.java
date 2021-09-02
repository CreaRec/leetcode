package com.leetcode.crearec.custom.structure.list.linked;

public class Node<V> {
	private Node<V> prev;
	private Node<V> next;
	private V value;

	public Node() {
	}

	public Node(V value) {
		this.value = value;
	}

	public Node<V> getPrev() {
		return prev;
	}

	public void setPrev(Node<V> prev) {
		this.prev = prev;
	}

	public Node<V> getNext() {
		return next;
	}

	public void setNext(Node<V> next) {
		this.next = next;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
}
