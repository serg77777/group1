package lesson140225;

public class switchExample {
	private static final int DIFF = 30;
	private static final int OLD_DIFF = 20;
	public static final int SUM = 10;

	public static void main(String[] args) {
		
		int[] program = {SUM,OLD_DIFF,12,DIFF};
		
		for (int command : program) {
			doCommand(command);
		}
	}

	private static void doCommand(int command) {
		switch (command) {
		case SUM:
			System.out.println("SUM");
			break;
		case OLD_DIFF:
		case DIFF:
			
			System.out.println("DIFF");
			break;
		default:
			
			System.out.println("not found");
			break;
		}
		
	}
}
