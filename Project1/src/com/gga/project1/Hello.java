package com.gga.project1;

public class Hello {
 
	public static void main(String[] args) {
		System.out.println("H,W!");	
		/*for (int i  = 0; i < args.length; i++) {
			System.out.println("Arg " + i + " = " + args[i]);
		}*/
		
		int i = 0;
		/*while (i < args.length) {
			System.out.println("Arg " + i + " = " + args[i++]);			
		}*/
		
		for (String string : args) {
			System.out.println("Arg  = " + string);			
		}
		
		i = 0;
		do {
			System.out.println("Arg " + i + " = " + args[i++]);						
		} while (i < args.length);
	}
}
