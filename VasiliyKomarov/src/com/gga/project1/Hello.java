package com.gga.project1;

public class Hello {
	public static void main(String[] p) {
		System.out.println("Hello, world!");
		for (int i = 0; i < p.length; i++) {
			System.out.println("Arg " + i + "=" + p[i]);
		}
		
		int i = 0;
		while (i < p.length) {
			System.out.println("Arg " + i + "=" + p[i++]);
//		i = i + 1;
//		i += 1;
//		i++;
		}
		for (String parametr : p){
			System.out.println("Arg =" + parametr);
			}
		i = 0;
		do {
			System.out.println("Arg " + i + "=" + p[i++]);
		}while (i < p.length);
		
		
		
	}
}
