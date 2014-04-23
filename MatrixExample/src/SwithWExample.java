
public class SwithWExample {

	private static final int DIFF = 30;
	private static final int POW = 40;
	private static final int OLD_SUM = 1;
	private static final int PROD = 20;
	private static final int SUM = 10;

	public static void main(String[] args) {
		
		int[] program = {OLD_SUM,SUM, DIFF, PROD, 12, POW};
		for (int command : program) {
			doCommand(command);
		}
	}
	
	private static void doCommand(int command) {
		switch(command) {
		case OLD_SUM:
		case SUM:
			System.out.println("Sum");
			break;
		case PROD:
			System.out.println("Prod");
			break;
		case DIFF:
			System.out.println("Diff");
			break;
		case POW:
			System.out.println("POW");
			break;
		default:
			System.out.println("unknown command");
		}
		System.out.println("---"); }
}
