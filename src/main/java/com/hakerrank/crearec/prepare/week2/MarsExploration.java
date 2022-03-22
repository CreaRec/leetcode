package com.hakerrank.crearec.prepare.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MarsExploration {

	public static int marsExploration(String s) {
		int count = 0;
		for (int i = 0; i < s.length() / 3; i++) {
			int index = i * 3;
			if (s.charAt(index) != 'S') {
				count++;
			}
			if (s.charAt(index + 1) != 'O') {
				count++;
			}
			if (s.charAt(index + 2) != 'S') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String s = bufferedReader.readLine();

		int result = marsExploration(s);
		System.out.println(result);

		bufferedReader.close();
	}
}
