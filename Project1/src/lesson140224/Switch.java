package lesson140224;

public class Switch {
	private static final int STORE_COMMAND = 20;
	private static final int LOAD_COMMAND = 10;

	public static void main(String[] args) {
		int a[] = { LOAD_COMMAND, STORE_COMMAND, 30, 40, 11, 50 };
		
		for (int command : a) {
			perform(command);
		}
		
	}

	private static void perform(int command) {
		// TODO Auto-generated method stub
		switch (command) {
		case LOAD_COMMAND:
		case 11:
			System.out.println("LOAD");
			break;
		case STORE_COMMAND:
			System.out.println("STORE");
			break;
		case 30:
			System.out.println("SUM");
			break;
		case 40:
			System.out.println("PROD");
			break;
		default:
			System.out.println("Unknown command code: " + command);
		}
	}
}