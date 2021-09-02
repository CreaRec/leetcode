package com.leetcode.crearec.custom.structure.list.linked;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCustomLinkedList {

	@Test
	public void testAddToEmpty() {
		CustomLinkedList<String> list = new CustomLinkedList<>();
		list.add("111");

		assertEquals("111", list.get(0));
	}

	@Test
	public void testAddToEmpty2() {
		CustomLinkedList<String> list = new CustomLinkedList<>();
		list.add(0, "111");

		assertEquals("111", list.get(0));
	}

	@Test
	public void testGetInvalidIndex() {
		CustomLinkedList<String> list = new CustomLinkedList<>();
		list.add("111");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.get(1));
	}

	@Test
	public void testAddInvalidIndex() {
		CustomLinkedList<String> list = new CustomLinkedList<>();
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.add(1, "111"));
	}

	@Test
	public void testAddInvalidIndex2() {
		CustomLinkedList<String> list = new CustomLinkedList<>();
		list.add("000");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.add(3, "111"));
	}

	@Test
	public void testAddToFilled() {
		CustomLinkedList<String> list = new CustomLinkedList<>();
		list.add("111");
		list.add("222");

		assertEquals("111", list.get(0));
		assertEquals("222", list.get(1));
	}

	@Test
	public void testAddByIndex() {
		CustomLinkedList<String> list = new CustomLinkedList<>();
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("444");
		list.add(2, "2323");

		assertEquals("111", list.get(0));
		assertEquals("222", list.get(1));
		assertEquals("2323", list.get(2));
		assertEquals("333", list.get(3));
		assertEquals("444", list.get(4));
	}

	@Test
	public void testRemoveByIndex() {
		CustomLinkedList<String> list = new CustomLinkedList<>();
		list.add("111");
		list.add("222");
		list.add("333");

		assertEquals("222", list.remove(1));

		assertEquals("111", list.get(0));
		assertEquals("333", list.get(1));
	}

	@Test
	public void testRemoveFirst() {
		CustomLinkedList<String> list = new CustomLinkedList<>();
		list.add("111");
		list.add("222");
		list.add("333");

		assertEquals("111", list.remove(0));

		assertEquals("222", list.get(0));
		assertEquals("333", list.get(1));
	}

	@Test
	public void testRemoveLast() {
		CustomLinkedList<String> list = new CustomLinkedList<>();
		list.add("111");
		list.add("222");
		list.add("333");

		assertEquals("333", list.remove(2));

		assertEquals("111", list.get(0));
		assertEquals("222", list.get(1));
	}

	@Test
	public void testRemoveInvalidIndex() {
		CustomLinkedList<String> list = new CustomLinkedList<>();
		list.add("111");
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.remove(1));
	}
}
