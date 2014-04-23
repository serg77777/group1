package lesson140224;

public class Switch3 {
	
	enum RobotCommands {Left, Right, Forward, TurnAround, Stop};
	
	public static void main(String[] args) {
		
		RobotCommands[] route = {RobotCommands.Left, RobotCommands.Right, RobotCommands.Right, RobotCommands.Forward};
		for (RobotCommands robotCommand : route) {
			perform(robotCommand);
		}
	}

	private static void perform(RobotCommands robotCommand) {
		// TODO Auto-generated method stub
		switch (robotCommand) {
		case Left:
			System.out.println("left");
			break;

		default:
			break;
		}
	}
}
