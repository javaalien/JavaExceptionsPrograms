package com.alien;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Java Exception Handling Best Practices

public class ExceptionHandlingBestPractices {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.err.println("File not found : " + e.getMessage());
		} catch (IOException e) {
			System.err.println("I/O Errror :" + e.getMessage());
		}
	}
}
