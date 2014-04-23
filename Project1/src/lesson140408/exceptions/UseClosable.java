package lesson140408.exceptions;

import java.util.Scanner;

public class UseClosable {

	public static void main(String[] args) {
		
	System.out.println("Start, enter something:");
		
	try(Scanner scanner = new Scanner(System.in)){	
		
		while (scanner.hasNextLine()){
			String line = scanner.nextLine();
			System.out.println(line);
		}
		}
		
	}
	
}
