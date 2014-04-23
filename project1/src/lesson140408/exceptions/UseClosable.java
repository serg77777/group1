package lesson140408.exceptions;

import java.util.Scanner;

public class UseClosable {

	public static void main(String[] args) {

		System.out.println("start: enter something");

		try (Scanner scanner = new Scanner(System.in)) { // rabotaet
															// autocloseable
			while (scanner.hasNextLine()) {
				String line = (String) scanner.nextLine();
				System.out.println(line);
			}
		}
		System.out.println("finished");
	}

}
