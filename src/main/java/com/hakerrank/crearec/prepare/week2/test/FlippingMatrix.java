package com.hakerrank.crearec.prepare.week2.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FlippingMatrix {

	public static int flippingMatrix(List<List<Integer>> matrix) {
		int n = matrix.size() / 2;
		int total = 0;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				int max = Integer.MIN_VALUE;
				max = Math.max(matrix.get(row).get(col), max);
				max = Math.max(matrix.get(row).get(2 * n - col - 1), max);
				max = Math.max(matrix.get(2 * n - row - 1).get(col), max);
				max = Math.max(matrix.get(2 * n - row - 1).get(2 * n - col - 1), max);
				total += max;
			}
		}
		return total;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int q = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, q).forEach(qItr -> {
			try {
				int n = Integer.parseInt(bufferedReader.readLine().trim());

				List<List<Integer>> matrix = new ArrayList<>();

				IntStream.range(0, 2 * n).forEach(i -> {
					try {
						matrix.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList()));
					} catch (IOException ex) {
						throw new RuntimeException(ex);
					}
				});

				int result = flippingMatrix(matrix);
				System.out.println(result);
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
	}
}
