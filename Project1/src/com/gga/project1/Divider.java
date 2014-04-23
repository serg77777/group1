package com.gga.project1;

public class Divider {

	public static void main(String[] args) {
		int result = devide(100, 20);
		System.out.println("Result = " + result);
	}

	private static int devide(int i, int j) {
		if (j == 0) {
			return Integer.MAX_VALUE;
		}

		return i / j;
	}

}
