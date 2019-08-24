package com.io.text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.io.text.helper.GenerateHelper;
import com.io.text.model.Employee;

@SpringBootApplication
public class TextApplication {

	public static void main(String[] args) {
		SpringApplication.run(TextApplication.class, args);
		File file = new File("D:\\Task_R\\Employee.txt");
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			List<Employee> list = new ArrayList<Employee>();
			String textLine; 
			textLine = bufferedReader.readLine();
			  while (textLine!= null) { 
				Employee emp = GenerateHelper.generateEmployee(textLine);
				list.add(emp);
			    textLine = bufferedReader.readLine();
			  } 
		for (Employee e : list)
		{
			System.out.println(e.toString());
		}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
