package lesson140224;

public class Switch2 {
	public static void main(String[] args) {
		char route[] = { 'L', 'L', 'F', 'F', 'T', 'F', 'R', ',', 'S' };
		for (int i = 0; i < route.length; i++) {
			moveRobot(route[i]);
		}
	}

	private static void moveRobot(char moveCommand) {
		switch (moveCommand) {
		case 'L':
			System.out.println("Move left");
			break;
		case 'F':
			System.out.println("Move forward");
			break;
		case 'R':
			System.out.println("Move right");
			break;
		case 'T':
			System.out.println("Turn around");
			break;
		case 'S':
			System.out.println("Stop");
			break;
		default:
			System.out.println("Unknown command: " + moveCommand);
			break;
		}

	}
}
