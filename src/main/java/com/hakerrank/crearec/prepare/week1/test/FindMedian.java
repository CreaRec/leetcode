package com.hakerrank.crearec.prepare.week1.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FindMedian {

	public static int findMedian(List<Integer> arr) {
		int[] array = arr.stream().mapToInt(i -> i).toArray();
		Arrays.sort(array);
		return array[arr.size() / 2];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());

		int result = findMedian(arr);
		System.out.println(result);

		bufferedReader.close();
	}
}
