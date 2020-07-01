package com.leetcode.crearec.array;

import java.util.Arrays;

public class ValidSudoku {
	public static void main(String[] args) {
		char[][] board = new char[][] { //
				{'5', '3', '.', /**/ '.', '7', '.', /**/ '.', '.', '.'}, //
				{'6', '.', '.', /**/ '1', '9', '5', /**/ '.', '.', '.'}, //
				{'.', '9', '8', /**/ '.', '.', '.', /**/ '.', '6', '.'}, //
				// ---------------------------------------------------
				{'8', '.', '.', /**/ '.', '6', '.', /**/ '.', '.', '3'}, //
				{'4', '.', '.', /**/ '8', '.', '3', /**/ '.', '.', '1'}, //
				{'7', '.', '.', /**/ '.', '2', '.', /**/ '.', '.', '6'}, //
				// ---------------------------------------------------
				{'.', '6', '.', /**/ '.', '.', '.', /**/ '2', '8', '.'}, //
				{'.', '.', '.', /**/ '4', '1', '9', /**/ '.', '.', '5'}, //
				{'.', '.', '.', /**/ '.', '8', '.', /**/ '.', '7', '9'} //
		};
		System.out.println(isValidSudoku(board));
	}

	public static boolean isValidSudoku(char[][] board) {
		boolean[] used = new boolean[9];
		for (char[] chars : board) {
			int curSum = 0;
			for (char aChar : chars) {
				curSum = processVal(used, aChar, curSum);
			}
			boolean isValidRow = checkBlock(used, curSum);
			if (isValidRow) {
				Arrays.fill(used, false);
			} else {
				return false;
			}
		}
		for (int i = 0; i < 9; i++) {
			int curSum = 0;
			for (char[] chars : board) {
				curSum = processVal(used, chars[i], curSum);
			}
			boolean isValidRow = checkBlock(used, curSum);
			if (isValidRow) {
				Arrays.fill(used, false);
			} else {
				return false;
			}
		}
		for (int k = 0; k < 3; k++) {
			for (int i = 0; i < 3; i++) {
				int curSum = 0;
				for (int j = 0; j < 3; j++) {
					curSum = processVal(used, board[i * 3][k * 3 + j], curSum);
					curSum = processVal(used, board[i * 3 + 1][k * 3 + j], curSum);
					curSum = processVal(used, board[i * 3 + 2][k * 3 + j], curSum);
				}
				boolean isValidRow = checkBlock(used, curSum);
				if (isValidRow) {
					Arrays.fill(used, false);
				} else {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean checkBlock(boolean[] used, int curSum) {
		for (int i = 0; i < used.length; i++) {
			boolean isUsed = used[i];
			if (!isUsed) {
				curSum += i + 1;
			}
		}
		return curSum == 45;
	}

	public static int processVal(boolean[] used, char aChar, int curSum) {
		if (aChar != '.') {
			int intNum = Character.getNumericValue(aChar);
			curSum += intNum;
			used[intNum - 1] = true;
		}
		return curSum;
	}
}
