package com.gga.project11;

public class B {
	public static void main(String[] args) {
		if (args.length == 0){
			System.out.println("Usage: B <number>");
			System.exit(1);
		}
		System.out.println("Arg: " + args[0]);
	
		int age = Integer.parseInt(args[0]);
		System.out.println("Age: " + age);
		
		if (age < 11) {
			System.out.println("ребенок");
		}
			
	}
}
