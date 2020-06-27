package com.leetcode.crearec.array;

import java.util.Arrays;

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
