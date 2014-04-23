package com.gga.project11;

public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello, world!");
		for (int i = 0; i < args.length; i++){
			System.out.println("Args" + i + " = " + args[i]);
		}
		
		int i = 0;
		while (i < args.length){
			System.out.println("Args" + i + " = " + args[i]);
			i++;
		}
		
		i = 0;
		do {
			System.out.println("Args" + i + " = " + args[i++]);
		} while(i < args.length);
	}
}
