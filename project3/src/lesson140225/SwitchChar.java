package lesson140225;

public class SwitchChar {
	public static void main(String[] args) {
		char[] route = { 'F', 'L', 'R', 'F', 'B'};
		for (char direction : route) {
			go(direction);
		}

	}

	private static void go(char direction) {
		
		switch (direction) {
		
		case 'F':
			System.out.println("forward");
			break;
		case 'L':
			System.out.println("left");
			break;
		case 'R':
			System.out.println("right");
			break;

		default:
			System.out.println("beep");
			break;
		}
		
	}
}
