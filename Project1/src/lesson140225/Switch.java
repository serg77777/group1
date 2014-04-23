package lesson140225;

public class Switch {

	public static final int DIFF = 30;
	private static final int POW = 40;
	private static final int PROD = 20;
	private static final int OLD_SUM = 1;
	private static final int SUM = 10;

	public static void main(String[] args) {
		
		int[] programm = {OLD_SUM,SUM,PROD,PROD,12,POW};
		
		for (int command : programm) {
			doCommand(command)
;		}
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
			System.out.println("dif");
			break;
		case POW:
			System.out.println("pow");
			break;
		default:
			System.out.println("unknow command");
		}
		System.out.println("---");
	}

}
