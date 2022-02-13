package com.hakerrank.crearec.prepare.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MiniMaxSum {
	public static void miniMaxSum(List<Integer> arr) {
		long min = 0;
		long max = 0;
		List<Integer> sortedList = arr.stream().sorted().collect(toList());
		for (int i = 0; i < sortedList.size(); i++) {
			Integer elem = sortedList.get(i);
			if (i != 4) {
				min += elem;
			}
			if (i != 0) {
				max += elem;
			}
		}
		System.out.println(min + " " + max);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());

		miniMaxSum(arr);

		bufferedReader.close();
	}
}
