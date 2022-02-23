package com.hakerrank.crearec.prepare.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class DiagonalDifference {

	public static int diagonalDifference(List<List<Integer>> arr) {
		int left = arr.get(0).get(0);
		int right = arr.get(0).get(arr.size() - 1);
		for (int i = 1; i < arr.size(); i++) {
			left += arr.get(i).get(i);
			right += arr.get(i).get(arr.size() - 1 - i);
		}
		return Math.abs(left - right);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<List<Integer>> arr = new ArrayList<>();

		IntStream.range(0, n).forEach(i -> {
			try {
				arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		int result = diagonalDifference(arr);
		System.out.println(result);

		bufferedReader.close();
	}
}
