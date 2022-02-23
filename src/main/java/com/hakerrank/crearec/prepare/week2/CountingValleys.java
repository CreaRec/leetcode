package com.hakerrank.crearec.prepare.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingValleys {

	public static int countingValleys(String path) {
		int valleyCount = 0;
		int start = 0;
		for (char c : path.toCharArray()) {
			if (c == 'U') {
				start++;
			} else {
				if (start == 0) {
					valleyCount++;
				}
				start--;
			}
		}
		return valleyCount;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String path = bufferedReader.readLine();

		int result = countingValleys(path);
		System.out.println(result);

		bufferedReader.close();
	}
}
