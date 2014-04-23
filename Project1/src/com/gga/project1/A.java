package com.gga.project1;

public class A {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, -40 };
		printArray(a);

		int[] b = null;

		b = new int[10];
		printArray(b);

		b = new int[] { 10, 2, 4, 5 };
		printArray(b);

		String[] s = new String[5];
		printArray(s);

		max(null);
		max(new int[0]);

	}

	static int max(int[] a) {
		int max = a[0];
			if (a == null || a.length<=0) 
		return Integer.MIN_VALUE;
	
			for (int i = 0; i < a.length; i++) {
				if (max < a[i])
					max = a[i];}
				return max;
				}

	private static void printArray(String[] s) {
		System.out.println(s.length);
		for (int i = 0; i < s.length; i++)
			System.out.println("[ " + i + " ] =" + s[i]);

	}

	private static void printArray(int[] a) {
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++)
			System.out.println("[ " + i + " ] =" + a[i]);
		System.out.println("max el = " + max(a));
	}

}
