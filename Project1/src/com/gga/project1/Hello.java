package com.gga.project1;


public class Hello {
	
	public static void main(String[] a) {
		System.out.println("Hello, word!");
		for (int i=0; i < a.length; i++){
			System.out.println("Arg " + i + " = " +a[i]);
			}
	}
	
}
/*
 * int i=0; 
 while (i<a.lenght){ 
System.out.println("Arg " + i + " = " +a[i++]);
//i++
} 

int i=0;
do{
System.out.println("Arg " + i + " = " +a[i++]);
} while (i<a.lenght);

*/
