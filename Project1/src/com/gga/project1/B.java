package com.gga.project1;

public class B {

	public static void main(String[] args) {
		if (args.length ==0){
			System.out.println("Usage: B <number>");
		//return;
			System.exit(0); 
		}
		System.out.println("Arg: "+ args[0]);
		int age = Integer.parseInt(args[0]);
		System.out.println("Age: "+ age);
		
		if(age<11) System.out.println("ребенок");
		else
		if(age<16) System.out.println("подросток");
		else
		if(age<25) System.out.println("юноша");
		else
		if(age<40) System.out.println("молодой человек");
		else
		if(age>=40) System.out.println("дядя");
		
		if (age%2 ==0)
			System.out.println("Чёт");
		else
			System.out.println("Нечёт");
	}
}
