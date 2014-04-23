
public class SwitchEnum {
	enum RobotCommands {Forward, Left, Right, Stop};
	public static void main(String[] args) {
		
		RobotCommands[] end = {RobotCommands.Forward, RobotCommands.Forward,
				RobotCommands.Left, RobotCommands.Right.Forward RobotCommands.Forward, RobotCommands.Stop;}
		
		for (RobotCommands robotCommands : end) {
			process(command);
		}
		}
		
	

	}

	private static void process(RobotCommands command) {
		switch (command) {
		case Forward:
			System.out.println(command.name());
			break;

		default:
			break;
		}
		
	}
}
