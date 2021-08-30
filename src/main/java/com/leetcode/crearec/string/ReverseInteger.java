package com.leetcode.crearec.string;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Constraints:
 * -2(31) <= x <= 2(31) - 1
 */
public class ReverseInteger {
	public static void main(String[] args) {
		int x = -2147483648;
		System.out.println(x);
		System.out.println(reverse(x));
	}

	private static int reverse(int x) {
		int result = 0;

		while (x != 0) {
			int remainder = x % 10;
			int newResult = result * 10 + remainder;
			if ((newResult - remainder) / 10 != result) {
				return 0;
			}
			result = newResult;
			x = x / 10;
		}

		return result;
	}

	// brute force solution
	private static int reverseUsingString(int x) {
		if (x == Integer.MIN_VALUE) {
			return 0;
		}
		int abs = Math.abs(x);
		if (abs < 10) {
			return x;
		}
		char[] s = String.valueOf(abs).toCharArray();
		char temp;
		for (int i = 0; i < s.length / 2; i++) {
			temp = s[i];
			s[i] = s[s.length - 1 - i];
			s[s.length - 1 - i] = temp;
		}
		try {
			int value = Integer.parseInt(String.copyValueOf(s));
			return x < 0 ? -value : value;
		} catch (NumberFormatException e) {
			return 0;
		}
	}
}
