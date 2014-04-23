package com.gga.project1;

public class B {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.exit(0);
		}
		int number = Integer.parseInt(args[0]);

		System.out.println(number);

		if (number < 10) {
			System.out.println("малыш");
		}

		else if (number < 15) {
			System.out.println("тин");
		}
	}
}
