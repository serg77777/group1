package lesson140224;

public class SwitchAndEnum {

	enum RobotCommands {
		Left, Right, Forward, TurnAround, Stop
	}

	public static void main(String[] args) {
		RobotCommands[] route = { RobotCommands.Left, RobotCommands.Forward,
				RobotCommands.Forward, RobotCommands.TurnAround, RobotCommands.Stop };

		for (RobotCommands robotCommand : route) {
			perform(robotCommand);
		}
	}

	private static void perform(RobotCommands robotCommand) {
		switch (robotCommand) {
		case Left:
			System.out.println("Move left");
			break;
		case Right:
			System.out.println("Move right");
			break;
		case Forward:
			System.out.println("Move forward");
			break;
		case TurnAround:
			System.out.println("Turn around");
			break;
		case Stop:
			System.out.println("Stop");
			break;
		default:
			System.out.println("ERR! UNKNOWN CMD:" + robotCommand);
		}

	}

}
