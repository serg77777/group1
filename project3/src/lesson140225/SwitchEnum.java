package lesson140225;

public class SwitchEnum {
	enum RCommands {Forward, Left, Right, Stop};

	public static void main(String[] args) {
		RCommands[] route = {RCommands.Forward, RCommands.Left, RCommands.Right, RCommands.Forward};
		
		for (RCommands rCommands : route) {
			go(rCommands);
		}
	}

	private static void go(RCommands rCommands) {
		switch (rCommands) {
		case Forward:
			System.out.println("Forward");
			break;
		case Left:
			System.out.println("Left");
			break;
		case Right:
			System.out.println("Right");
			break;
		default:
			System.out.println("not found");
			break;
		}
	}
	
}
