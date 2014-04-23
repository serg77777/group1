package lesson140224;

public class Switch2 {
	public static void main(String[] args) {
		char route[] = { 'L', 'L', 'F', 'F', 'R', 'T', 'F', 'S' };
		
		for (int i = 0; i < route.length; i++) {
			moveRobot(route[i]);
		}
		
	}

	private static void moveRobot(char moveCommand) {
		// TODO Auto-generated method stub
		switch (moveCommand) {
		case 'L':
			System.out.println("move left");
			break;
		case 'F':
			System.out.println("move forward");
			break;
		case 'R':
			System.out.println("move right");
			break;
		case 'T':
			System.out.println("turn around");
			break;
		case 'S':
			System.out.println("stop");
			break;
		default:
			break;
		}
	}
}
