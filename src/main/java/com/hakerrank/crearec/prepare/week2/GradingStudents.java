package com.hakerrank.crearec.prepare.week2;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class GradingStudents {

	public static List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> result = new ArrayList<>(grades.size());
		for (Integer grade : grades) {
			int calc = grade % 5;
			if (grade < 38 || calc == 0) {
				result.add(grade);
			} else {
				int diff = 5 - calc;
				result.add(diff <= 2 ? (grade + diff) : grade);
			}
		}
		return result;
	}

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = gradingStudents(grades);
	    System.out.println(result.stream()
	                             .map(Object::toString)
	                             .collect(joining("\n"))
	                       + "\n");

        bufferedReader.close();
    }
}
