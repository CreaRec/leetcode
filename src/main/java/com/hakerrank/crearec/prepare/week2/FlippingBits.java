package com.hakerrank.crearec.prepare.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class FlippingBits {

	public static long flippingBits(long n) {
		char[] resultChars = new char[32];
		Arrays.fill(resultChars, '1');
		char[] binaryChars = Long.toBinaryString(n).toCharArray();
		for (int i = 0; i < binaryChars.length; i++) {
			if (binaryChars[i] == '1') {
				resultChars[32 - binaryChars.length + i] = '0';
			}
		}
		String s = new String(resultChars);
		return Long.parseLong(s, 2);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int q = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, q).forEach(qItr -> {
			try {
				long n = Long.parseLong(bufferedReader.readLine().trim());

				long result = flippingBits(n);
				System.out.println(result);
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
	}
}
