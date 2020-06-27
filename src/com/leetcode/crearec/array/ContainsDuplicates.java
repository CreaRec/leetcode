package com.leetcode.crearec.array;

public class ContainsDuplicates {
	public static void main(String[] args) {
		int[] nums = new int[] {1, 2, 3, 4, 1};
		System.out.println(containsDuplicate(nums));
	}

	public static boolean containsDuplicate(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int search = nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				if (search == nums[j]) {
					return true;
				}
			}
		}
		return false;
	}
}
