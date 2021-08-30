package com.leetcode.crearec.string;

/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 *
 * Constraints:
 * 1 <= s.length <= 105
 * s[i] is a printable ascii character.
 */
public class ReverseString {
	public static void main(String[] args) {
		String s = "Programming";
		System.out.println(s);
		char[] charArray = s.toCharArray();
		reverseString(charArray);
		System.out.println(String.copyValueOf(charArray));
	}

	private static void reverseString(char[] s) {
		char temp;
		for (int i = 0; i < s.length / 2; i++) {
			temp = s[i];
			s[i] = s[s.length - 1 - i];
			s[s.length - 1 - i] = temp;
		}
	}
}
