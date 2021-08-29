package com.leetcode.crearec.custom.structure.hashtable;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestCustomHashTable {

	@Test
	public void testPut() {
		CustomHashTable<String> table = new CustomHashTable<>();
		table.put("0", "000");
		table.put("1", "111");

		assertEquals("000", table.get("0"));
		assertEquals("111", table.get("1"));
	}

	@Test
	public void testCollision() {
		CustomHashTable<String> table = new CustomHashTable<>();
		table.put("0", "000");
		table.put("1", "111");
		table.put("20", "2020"); // '20' has the save index after hash code functions as '0'

		assertEquals("000", table.get("0"));
		assertEquals("2020", table.get("20"));
	}

	@Test
	public void testReplace() {
		CustomHashTable<String> table = new CustomHashTable<>();
		table.put("0", "000");
		table.put("1", "111");
		table.put("0", "000999");

		assertEquals("000999", table.get("0"));
		assertEquals("111", table.get("1"));
	}

	@Test
	public void testDelete() {
		CustomHashTable<String> table = new CustomHashTable<>();
		table.put("0", "000");
		table.put("1", "111");

		assertEquals("000", table.get("0"));
		assertEquals("111", table.get("1"));

		table.delete("0");

		assertNull(table.get("0"));
		assertEquals("111", table.get("1"));
	}

	@Test
	public void testDeleteCollision() {
		CustomHashTable<String> table = new CustomHashTable<>();
		table.put("0", "000");
		table.put("1", "111");
		table.put("20", "2020"); // '20' has the save index after hash code functions as '0'

		assertEquals("000", table.get("0"));
		assertEquals("111", table.get("1"));
		assertEquals("2020", table.get("20"));

		String deleted = table.delete("0");
		assertEquals("000", deleted);

		assertNull(table.get("0"));
		assertEquals("111", table.get("1"));
		assertEquals("2020", table.get("20"));
	}
}
