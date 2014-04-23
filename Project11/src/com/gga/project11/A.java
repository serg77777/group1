package com.gga.project11;

public class A {
	public static void main(String[] args) {
		int a[] = {11,22,33,-44};
		printArray(a);
		int[] b = null;
		
		System.out.println(b);
		b = new int[10];
		System.out.println(b);
		printArray(b);
		b = new int[] {12, 23, 34, 45};

		printArray(b);
		String[] s = new String[5];
		printArray(s);
		
	}	

	 static int max(int[] a){
		if (a == null) {
			return Integer.MIN_VALUE;
		}
		if (a.length <= 0) {
			return Integer.MIN_VALUE;
		}
			int max = a[0];
			for (int i : a){
				if (max < i) {
					max = i;
				}
			}
			return max;
	
	}
	private static void printArray(String[] s) {
		// TODO Auto-generated method stub
		for (int i = 0; i < s.length; i++) {
			System.out.println("[" + i + "]" + " = " + s[i]);
		}		
	}

	private static void printArray(int[] a) {
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println("[" + i + "]" + " = " + a[i]);
		}
		System.out.println("Max = " + max(a));
	}
}
