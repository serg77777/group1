package lesson140225;

public class SwitchExample {

	private static final int Right = 354;
	private static final int Left = 74;
	private static final int Pow = 345;
	private static final int PROD = 45;
	private static final int All_Sum = 235;
	private static final int Sum = 234;

	public static void main(String[] args) {
		
		
		int[] program = {Sum, Right, All_Sum, Left, PROD, Pow};
		
		for (int command : program) {
			doCommand(command);
		}
	}

	private static void doCommand(int command) {
		switch (command) {
		case All_Sum:
		case Sum: 
			System.out.println("case 1");
			break;
		case Right:
			System.out.println("case 2");
			break;
		case Left:
			System.out.println("case 4");
			break;
		case PROD:
			System.out.println("case 5");
			break;
		case Pow:
			System.out.println("case 6");
			break;
		default:
			System.out.println("default");
			
		}
		
		
	}

}
