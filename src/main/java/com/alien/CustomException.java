package com.alien;

// Write a Java program to create and throw custom exceptions.

public class CustomException {

	public static void main(String[] args) throws MyException {
		throw new MyException("This is custom Exception.");
	}

}

class MyException extends Exception {
	public MyException(String message) {
		super(message);
	}
}