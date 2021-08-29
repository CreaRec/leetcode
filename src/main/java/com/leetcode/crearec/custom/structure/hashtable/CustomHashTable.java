package com.leetcode.crearec.custom.structure.hashtable;

public class CustomHashTable<V> {
	private static final int SIZE = 20;
	private transient Node<V>[] array = new Node[SIZE];

	public void put(String key, V value) {
		Node<V> node = array[getIndexByKey(key)];
		Node<V> parent = null;
		while (node != null) {
			if (node.getKey().equals(key)) {
				node.setValue(value);
				break;
			} else {
				parent = node;
				node = node.getNext();
			}
		}
		if (node == null) {
			if (parent == null) {
				array[getIndexByKey(key)] = new Node<>(key, value);
			} else {
				parent.setNext(new Node<>(key, value));
			}
		}
	}

	public V get(String key) {
		Node<V> node = array[getIndexByKey(key)];
		while (node != null) {
			if (node.getKey().equals(key)) {
				return node.getValue();
			} else {
				node = node.getNext();
			}
		}
		return null;
	}

	public V delete(String key) {
		Node<V> node = array[getIndexByKey(key)];
		Node<V> parent = null;
		while (node != null) {
			if (node.getKey().equals(key)) {
				V value = node.getValue();
				if (parent == null) {
					array[getIndexByKey(key)] = node.getNext();
				} else {
					parent.setNext(node.getNext());
				}
				return value;
			} else {
				parent = node;
				node = node.getNext();
			}
		}
		return null;
	}

	private static long customHashFunction(String key) {
		long hash = 7;
		for (int i = 0; i < key.length(); i++) {
			hash = hash * 31 + key.charAt(i);
		}
		return hash;
	}

	public static int getIndexByKey(String key) {
		return (int) customHashFunction(key) % SIZE;
	}
}
