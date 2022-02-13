package com.hakerrank.crearec.prepare.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CamelCase4 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String input;
		while ((input = bufferedReader.readLine()) != null) {
			String[] splitInput = input.trim().split(";");
			char[] chars = splitInput[2].toCharArray();
			StringBuilder sb = new StringBuilder();
			switch (splitInput[0]) {
				case "S":
					int trimAmount = 0;
					switch (splitInput[1]) {
						case "M":
							trimAmount = 2;
						case "V":
						case "C":
							for (int i = 0; i < chars.length - trimAmount; i++) {
								char currChar = chars[i];
								if (Character.isUpperCase(currChar)) {
									if (i != 0) {
										sb.append(" ");
									}
									sb.append(Character.toLowerCase(currChar));
								} else {
									sb.append(currChar);
								}
							}
							break;
					}
					break;
				case "C":
					boolean isNeedToUpperCase = false;
					switch (splitInput[1]) {
						case "C":
							isNeedToUpperCase = true;
						case "M":
						case "V":
							for (char currChar : chars) {
								if (isNeedToUpperCase) {
									sb.append(Character.toUpperCase(currChar));
									isNeedToUpperCase = false;
								} else if (Character.isSpaceChar(currChar)) {
									isNeedToUpperCase = true;
								} else {
									sb.append(currChar);
								}
							}
							break;
					}
					if ("M".equals(splitInput[1])) {
						sb.append("()");
					}
					break;
			}
			System.out.println(sb);
		}
	}
}
