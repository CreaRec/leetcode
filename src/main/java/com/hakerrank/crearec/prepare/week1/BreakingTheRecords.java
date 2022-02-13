package com.hakerrank.crearec.prepare.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class BreakingTheRecords {
	public static List<Integer> breakingRecords(List<Integer> scores) {
		List<Integer> result = new ArrayList<>(2);
		int min = scores.get(0);
		int max = min;
		int countMin = 0;
		int countMax = 0;
		if (scores.size() > 1) {
			for (int i = 1; i < scores.size(); i++) {
				Integer elem = scores.get(i);
				if (elem > max) {
					max = elem;
					countMax++;
				} else if (elem < min) {
					min = elem;
					countMin++;
				}
			}
		}
		result.add(countMax);
		result.add(countMin);
		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());

		List<Integer> result = breakingRecords(scores);
		System.out.println("Max Min");
		System.out.println(result.get(0) + " " + result.get(1));

		bufferedReader.close();
	}
}
