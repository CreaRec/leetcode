package com.leetcode.crearec.array;

import java.util.Arrays;

/**
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 */
public class PlusOne {
	public static void main(String[] args) {
		int[] nums = new int[] {9, 9, 9};
		System.out.println(Arrays.toString(plusOne(nums)));
	}

	public static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] == 9) {
				digits[i] = 0;
				if (i == 0) {
					int[] temp = new int[digits.length + 1];
					temp[0] = 1;
					System.arraycopy(digits, 0, temp, 1, digits.length);
					digits = temp;
				}
			} else {
				digits[i] = ++digits[i];
				break;
			}
		}
		return digits;
	}
}
