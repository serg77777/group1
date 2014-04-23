
public class SwitchAndEnum {
	
	enum RobotCommands {Left, Right, Forward, TurnAround, Stop};
	
	public static void main(String[] args) {
		
		RobotCommands[] route = {RobotCommands.Left, RobotCommands.Right, RobotCommands.Right, RobotCommands.Forward};
		
		for (RobotCommands robotCommand : route) {
			perform(robotCommand);
		}
	}

	private static void perform(RobotCommands robotCommand) {
		switch (robotCommand) {
		case Left:
			System.out.println("moved Left");
			break;
		case Forward:
			System.out.println("moved Forward");
			break;
		case Right:
			System.out.println("moved Right");
			break;
		case TurnAround:
			System.out.println("turned around");
			break;
		case Stop:
			System.out.println("stopped");
			break;
		default:
			break;
		}
	}
}
