package com.leetcode.crearec.array;

import java.util.Arrays;

/**
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 * <p>
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
 * DO NOT allocate another 2D matrix and do the rotation.
 * <p>
 * Constraints:
 * matrix.length == n
 * matrix[i].length == n
 * 1 <= n <= 20
 * -1000 <= matrix[i][j] <= 1000
 */
public class RotateImage {
	public static void main(String[] args) {
		int[][] matrix = new int[][]
						{{2, 29, 20, 26, 16, 28},
						{12, 27, 9,  25, 13, 21},
						{32, 33, 32, 2,  28, 14},
						{13, 14, 32, 27, 22, 26},
						{33, 1,  20, 7,  21, 7},
						{4,  24, 1,  6,  32, 34}};
		System.out.println(toString2D(matrix));
		System.out.println("------------------------");
		System.out.println(toString2D(rotate(matrix)));
	}

	public static int[][] rotate(int[][] matrix) {
		int n = matrix.length;
		for (int i = 0; i < (n + 1) / 2; i ++) {
			for (int j = 0; j < n / 2; j++) {
				int temp = matrix[n - 1 - j][i];
				matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
				matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 -i];
				matrix[j][n - 1 - i] = matrix[i][j];
				matrix[i][j] = temp;
			}
		}
		return matrix;
	}

	private static String toString2D(int[][] array) {
		final StringBuilder str = new StringBuilder();
		for (int[] ints : array) {
			for (int anInt : ints) {
				str.append(" ").append(anInt);
			}
			str.append("\n");
		}
		str.append("\n");
		return str.toString();
	}
}

