
public class SwitchExample {
	
	private static final int NEW_LOAD_COMMAND = 11;
	private static final int PROD_COMMAND = 40;
	private static final int SUM_COMMAND = 30;
	private static final int STOR_COMMAND = 20;
	private static final int LOAD_COMMAND = 10;

	public static void main(String[] args) {
		
		int program[] = {LOAD_COMMAND, STOR_COMMAND, SUM_COMMAND, PROD_COMMAND, NEW_LOAD_COMMAND, 345};
		
		if(program[0] == LOAD_COMMAND) {
			// do something
		}
		
		for(int command : program) {
			perform(command);
		}
	}
	
	public static void perform(int command) {
		switch (command) {
		case LOAD_COMMAND:
		case NEW_LOAD_COMMAND:
			System.out.println("LOAD");
			break;
		case STOR_COMMAND:
			System.out.println("STOR");
			break;
		case SUM_COMMAND:
			System.out.println("SUM");
			break;
		case PROD_COMMAND:
			System.out.println("PROD");
			break;
		default:
			System.out.println("unknoun command code: " + command);			
		}
	}

}
