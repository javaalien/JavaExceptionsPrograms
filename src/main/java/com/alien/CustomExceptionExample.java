package com.alien;

// How to write custom exceptions in Java?

public class CustomExceptionExample {

	public static void main(String[] args) {

		try {
			validateAge(15);
		} catch (InvalidAgeException e) {
			System.out.println("Caught custom exception: " + e.getMessage());
		}

	}

	private static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age must be 18 or older.");
		}
		System.out.println("Age is valid.");

	}
}

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}