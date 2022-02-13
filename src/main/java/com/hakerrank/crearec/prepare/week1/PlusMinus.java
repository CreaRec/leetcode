package com.hakerrank.crearec.prepare.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PlusMinus {
	public static void plusMinus(List<Integer> arr) {
		DecimalFormat df = new DecimalFormat("0.000000");
		double size = arr.size();
		int minus = 0;
		int plus = 0;
		int zero = 0;
		for (Integer elem : arr) {
			if (elem < 0) {
				minus++;
			} else if (elem > 0) {
				plus++;
			} else {
				zero++;
			}
		}
		System.out.println(df.format(Math.round(plus / size * 1000000) / 1000000.0d));
		System.out.println(df.format(Math.round(minus / size * 1000000) / 1000000.0d));
		System.out.println(df.format(Math.round(zero / size * 1000000) / 1000000.0d));
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());

		plusMinus(arr);

		bufferedReader.close();
	}
}
