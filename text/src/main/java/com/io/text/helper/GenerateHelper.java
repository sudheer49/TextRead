package com.io.text.helper;

import com.io.text.model.Employee;

public class GenerateHelper {
	public final static String delimeter = ";";
	public final static int size = 4;

	public static Employee generateEmployee(String textLine) {

		String[] textArray = textLine.split(delimeter);
		Employee employee = null;
		if (textArray.length == size) {
			employee = new Employee(Integer.parseInt(textArray[0]), textArray[1], textArray[2],
					Long.parseLong(textArray[3]));

		}
		return employee;
	}
}
