package com.hakerrank.crearec.prepare.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class DivisibleSumPairs {

	public static int divisibleSumPairs(int k, List<Integer> ar) {
		int count = 0;
		for (int i = 0; i < ar.size() - 1; i++) {
			int first = ar.get(i);
			for (int j = i + 1; j < ar.size(); j++) {
				int second = ar.get(j);
				if ((first + second) % k == 0) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int k = Integer.parseInt(bufferedReader.readLine());

		List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());

		int result = divisibleSumPairs(k, ar);
		System.out.println(result);

		bufferedReader.close();
	}
}
