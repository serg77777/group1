package com.gga.project1;

public class A {
	public static void main(String[] args) {
		a(args[0]);
	}

	static void a(String param) {
		System.out.println("parameter " + param);
		if (param.equals("one")) {
			System.out.println("один");
		}
	}
}
