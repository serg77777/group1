package lesson140224;

public class Switch2 {

	public static void main(String[] args) {
		char route[]={'l','l','r','r','t','f'};
		for (int i=0; i<route.length ;i++){
			moveRobot(route[i]);
		}

	}

	private static void moveRobot(char moveCommand) {
		switch (moveCommand) {
		case 'l':
			System.out.println("moved left");
			break;
		case 'r':
			System.out.println("move right");
			break;
		case 't':
			System.out.println("turned around");
			break;
		default:
			System.out.println("command not recognised");
			break;
		}
		
	}

}
