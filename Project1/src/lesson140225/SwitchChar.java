package lesson140225;

public class SwitchChar {

	public static void main(String[] args) {
		
		char[] route = {'f', 'f', 'l', 'l', 'r' , 's'};
		
		for (char direction : route) {
			go(direction);
		}
		
	}

	private static void go(char direction) {
		switch (direction) {
		case 'f':
			System.out.println("Front");
			break;
		case 'l':
			System.out.println("Left");
			break;
		case 'r':
			System.out.println("Rigth");
			break;
		case 's':
			System.out.println("Stop");
			break;


		default:
			break;
		}
		
	}

}
