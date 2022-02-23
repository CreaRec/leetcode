package com.hakerrank.crearec.prepare.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CountingSort1 {

	public static List<Integer> countingSort(List<Integer> arr) {
		List<Integer> result = new ArrayList<>(100);
		for (int i = 0; i < 100; i++) {
			result.add(0);
		}
		for (Integer current : arr) {
			result.set(current, result.get(current) + 1);
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());

		List<Integer> result = countingSort(arr);
		System.out.println(result.stream().map(Object::toString).collect(joining(" ")) + "\n");

		bufferedReader.close();
	}
}
