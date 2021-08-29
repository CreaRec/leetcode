package com.leetcode.crearec.array;

import java.util.Arrays;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
public class TwoSum {
	public static void main(String[] args) {
		int[] nums = new int[] {-1, -2, -3, -4, -5};
		int target = -8;
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		boolean isInit = false;
		for (int i = 0; i < nums.length; i++) {
			result[0] = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[1] = j;
					isInit = true;
					break;
				}
			}
			if (isInit) {
				break;
			}
		}
		return result;
	}
}
