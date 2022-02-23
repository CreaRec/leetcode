package com.hakerrank.crearec.prepare.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;

public class Pangrams {

	public static String pangrams(String s) {
		s = s.replaceAll(" ", "").toLowerCase(Locale.ROOT);
		if (s.length() < 26) {
			return "not pangram";
		}
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		char current = 'a';
		char prev = 0;
		for (char c : chars) {
			if (c != prev) {
				if (c == current) {
					current++;
				} else {
					return "not pangram";
				}
			}
			prev = c;
		}
		return "pangram";
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String s = bufferedReader.readLine();

		String result = pangrams(s);
		System.out.println(result);

		bufferedReader.close();
	}
}
