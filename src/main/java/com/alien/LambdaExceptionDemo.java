package com.alien;

// Can you throw any exception inside a lambda expression’s body?

interface ThrowingCustomer<T> {
	void accept(T t) throws Exception;
}

public class LambdaExceptionDemo {

	public static void main(String[] args) {

		ThrowingCustomer<Integer> consumer = (Integer i) -> {
			if (i < 0) {
				throw new Exception("Negative value not allowed");
			}
			System.out.println(i);
		};

		try {
			consumer.accept(-1);
		} catch (Exception e) {
			System.out.println("Caught exception: " + e.getMessage());
		}
	}
}
