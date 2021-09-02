package com.leetcode.crearec.string;

import java.util.Arrays;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * <p>
 * Constraints:
 * 1 <= s.length, t.length <= 5 * 10(4)
 * s and t consist of lowercase English letters.
 */
public class ValidAnagram {
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		System.out.println(isAnagram(s, t));
	}

	private static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		s = sort(s);
		t = sort(t);
		return s.equals(t);
	}

	public static String sort(String str) {
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}
}
