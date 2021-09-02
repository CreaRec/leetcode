package com.leetcode.crearec.custom.structure.list.linked;

public class CustomLinkedList<V> {
	private Node<V> first;
	private Node<V> last;

	private int size = 0;

	public void add(V value) {
		Node<V> newNode = new Node<>(value);
		if (last == null) {
			this.first = newNode;
			last = this.first;
		} else {
			last.setNext(newNode);
			newNode.setPrev(last);
			last = newNode;
		}
		size++;
	}

	public void add(int index, V value) {
		if (index == 0) {
			add(value);
		} else if (index < size) {
			Node<V> nodeAfter = getNodeByIndex(index);
			setNodeBetween(new Node<>(value), nodeAfter.getPrev(), nodeAfter);
			size++;
		} else {
			throw new ArrayIndexOutOfBoundsException("List size is " + size + ", but requested index is " + index);
		}
	}

	public V get(int index) {
		if (index < size) {
			return getNodeByIndex(index).getValue();
		} else {
			throw new ArrayIndexOutOfBoundsException("List size is " + size + ", but requested index is " + index);
		}
	}

	public V remove(int index) {
		if (index < size) {
			V value;
			if (index == 0) {
				value = first.getValue();
				first = first.getNext();
				first.setPrev(null);
			} else if (index == size - 1) {
				value = last.getValue();
				last = last.getPrev();
				last.setNext(null);
			} else {
				Node<V> toRemove = getNodeByIndex(index);
				value = toRemove.getValue();
				Node<V> first = toRemove.getPrev();
				Node<V> second = toRemove.getNext();
				first.setNext(second);
				second.setPrev(first);
			}
			size--;
			return value;
		} else {
			throw new ArrayIndexOutOfBoundsException("List size is " + size + ", but requested index is " + index);
		}
	}

	private Node<V> getNodeByIndex(int index) {
		Node<V> node;
		if (index < ((size - 1) / 2)) {
			node = first;
			for (int i = 1; i <= index; i++) {
				node = node.getNext();
			}
		} else {
			node = last;
			for (int i = size - 1; i > index; i--) {
				node = node.getPrev();
			}
		}
		return node;
	}

	private void setNodeBetween(Node<V> newNode, Node<V> before, Node<V> after) {
		Node<V> nodeBefore = after.getPrev();
		nodeBefore.setNext(newNode);
		newNode.setPrev(nodeBefore);
		newNode.setNext(after);
		after.setPrev(newNode);
	}
}
