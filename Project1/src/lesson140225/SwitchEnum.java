package lesson140225;

public class SwitchEnum {
	
	enum RobotCommands {Forward, Left, Rigth, Stop};

	public static void main(String[] args) {
		
		RobotCommands[] route = {RobotCommands.Forward, RobotCommands.Left, RobotCommands.Rigth, RobotCommands.Left, RobotCommands.Stop};
		
		
		for (RobotCommands command : route) {
			process(command);
		}

	}

	private static void process(RobotCommands command) {
		
	}


}
