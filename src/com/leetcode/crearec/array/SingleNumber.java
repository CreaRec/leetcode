package com.leetcode.crearec.array;

import java.util.Arrays;

public class SingleNumber {
	public static void main(String[] args) {
		int[] nums = new int[] {5, 3, 1, 1, 3};
		System.out.println(singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {
		Arrays.sort(nums);
		Integer result = null;
		for (int i = 1; i < nums.length; i += 2) {
			int prevNum = nums[i - 1];
			if (nums[i] != prevNum) {
				result = prevNum;
				break;
			}
		}
		if (result == null) {
			result = nums[nums.length - 1];
		}
		return result;
	}
}
