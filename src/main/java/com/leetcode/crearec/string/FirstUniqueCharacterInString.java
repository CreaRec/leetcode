package com.leetcode.crearec.string;

/**
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 *
 * Constraints:
 * 1 <= s.length <= 105
 * s consists of only lowercase English letters.
 */
public class FirstUniqueCharacterInString {
	public static void main(String[] args) {
		String s = "z";
		System.out.println(s);
		System.out.println(firstUniqChar(s));
	}

	private static int firstUniqChar(String s) {
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			char current = chars[i];
			boolean isFound = false;
			for (int j = 0; j < chars.length; j++) {
				if (i != j && current == chars[j]) {
					isFound = true;
					break;
				}
			}
			if (!isFound) {
				return i;
			}
		}
		return -1;
	}
}
