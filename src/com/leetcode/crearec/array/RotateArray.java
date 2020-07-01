package com.leetcode.crearec.array;

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 */
public class RotateArray {
	public static void main(String[] args) {
		int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
		rotate(nums, 3);
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}

	public static void rotate(int[] nums, int k) {
		for (int i = 0; i < k; i++) {
			int temp = nums[nums.length - 1];
			System.arraycopy(nums, 0, nums, 1, nums.length - 1);
			nums[0] = temp;
		}
	}
}
