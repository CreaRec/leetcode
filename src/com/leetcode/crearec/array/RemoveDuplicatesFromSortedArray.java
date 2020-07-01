package com.leetcode.crearec.array;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
		int[] nums = new int[] {1, 1, 5, 7, 7, 9, 14};
		int len = removeDuplicates(nums);

		for (int i = 0; i < len; i++) {
			System.out.println(nums[i]);
		}
	}

	public static int removeDuplicates(int[] nums) {
		int indexToInsert = 0;
		if (nums.length != 0) {
			indexToInsert++;
			int prevNumber = nums[0];
			for (int i = 1; i < nums.length; i++) {
				int number = nums[i];
				if (number > prevNumber) {
					nums[indexToInsert++] = number;
					prevNumber = number;
				}
			}
		}
		return indexToInsert;
	}
}
