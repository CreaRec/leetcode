package com.leetcode.crearec.array;

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
