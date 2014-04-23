package lesson140408.Exception;

import java.util.Scanner;

public class UseClosable {

	public static void main(String[] args) {
		
		System.out.println("start: enter someting ");
		
		try (Scanner scanner = new Scanner(System.in)) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}
		}
		
		System.out.println("finished");	
	}
	
}
