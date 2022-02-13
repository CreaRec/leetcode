package com.hakerrank.crearec.prepare.week1;

import java.io.IOException;

public class TimeConversion {

	public static String timeConversion(String s) {
		String newHours = s.substring(0, 2);
		int oldHours = Integer.parseInt(newHours);
		if (s.endsWith("PM")) {
			newHours = Integer.valueOf(oldHours == 12 ? oldHours : (oldHours + 12)).toString();
		} else if (oldHours == 12) {
			newHours = "00";
		}
		return newHours + s.substring(2, 8);
	}

	public static void main(String[] args) throws IOException {
		String result = timeConversion("01:01:00AM");
		System.out.println(result);

		result = timeConversion("11:01:00AM");
		System.out.println(result);

		result = timeConversion("12:01:00AM");
		System.out.println(result);

		result = timeConversion("01:01:00PM");
		System.out.println(result);

		result = timeConversion("11:01:00PM");
		System.out.println(result);

		result = timeConversion("12:01:00PM");
		System.out.println(result);
	}
}
