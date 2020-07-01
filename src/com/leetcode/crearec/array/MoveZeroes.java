package com.leetcode.crearec.array;

import java.util.Arrays;

public class MoveZeroes {
	public static void main(String[] args) {
		int[] nums = new int[] {1, 0};
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}

	public static void moveZeroes(int[] nums) {
		int prevZeroCount = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				prevZeroCount++;
			} else if (prevZeroCount > 0) {
				nums[i - prevZeroCount] = nums[i];
				nums[i] = 0;
			}
		}
	}
}
