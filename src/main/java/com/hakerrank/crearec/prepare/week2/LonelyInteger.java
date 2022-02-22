package com.hakerrank.crearec.prepare.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class LonelyInteger {

	public static int lonelyinteger(List<Integer> a) {
		int[] array = a.stream().mapToInt(i -> i).toArray();
		Arrays.sort(array);
		for (int i = 0; i < a.size(); i = i + 2) {
			int current = array[i];
			if (i == a.size() - 1 || current != array[i + 1]) {
				return current;
			}
		}
		return 0;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());

		int result = lonelyinteger(a);
		System.out.println(result);

		bufferedReader.close();
	}
}
