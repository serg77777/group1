package lesson140225;

public class Swithcchart {

	public static void main(String[] args) {
		
		char[] route = {'F','F','L','F','R','S'};
		
		for (char derection : route) {
			go(derection);
		}
	}

	private static void go(char derection) {
		switch (derection) {
		case 'F':
			System.out.println("Forward");
			break;
		case 'L':
			
			System.out.println("Left");
			break;
		case 'R':
			System.out.println("Right");
			
			break;
		case 'S':
			
			System.out.println("Stop");
			break;

		default:
			break;
		}
		
	}

}
