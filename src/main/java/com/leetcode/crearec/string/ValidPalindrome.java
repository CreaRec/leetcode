package com.leetcode.crearec.string;

import java.util.Arrays;

/**
 * Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * <p>
 * Constraints:
 * 1 <= s.length <= 2 * 10(5)
 * s consists only of printable ASCII characters.
 */
public class ValidPalindrome {
	public static void main(String[] args) {
		String s = "0P";
		System.out.println(isPalindrome(s));
	}

	private static boolean isPalindrome(String s) {
		if (s.isEmpty()) {
			return false;
		}
		char[] sChar = s.toLowerCase().replaceAll("[^a-z0-9]", "").toCharArray();
		int length = sChar.length;
		if (length == 0) {
			return true;
		}
		for (int i = 0; i < length / 2; i++) {
			if (sChar[i] != sChar[length - i - 1]) {
				return false;
			}
		}
		return true;
	}
}
