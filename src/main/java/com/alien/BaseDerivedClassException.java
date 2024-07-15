package com.alien;

class Base {
	void m1() throws NullPointerException {
		System.out.println("base class m1");
	}
}

class Derived extends Base {
	void m1() throws RuntimeException {
		System.out.println("derived m2");
	}
}

public class BaseDerivedClassException {

	public static void main(String[] args) throws Exception {
		Derived b = new Derived();
		b.m1();
	}
}
