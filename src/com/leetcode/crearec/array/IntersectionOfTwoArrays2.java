package com.leetcode.crearec.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given two arrays, write a function to compute their intersection.
 */
public class IntersectionOfTwoArrays2 {
	public static void main(String[] args) {
		int[] nums1 = new int[] {4,9,5};
		int[] nums2 = new int[] {9,4,9,8,4};
		System.out.println(Arrays.toString(intersect(nums1, nums2)));
	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> result = new ArrayList<>();
		List<Integer> ints1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
		List<Integer> ints2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
		for (Integer integer : ints1) {
			if (ints2.remove(integer)) {
				result.add(integer);
			}
		}
		return result.stream().mapToInt(Integer::intValue).toArray();
	}
}
