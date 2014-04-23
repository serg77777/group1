
package lesson140224;
public class SwitchAndEnum {

	enum RobotCommands{Left, Right,Forward,TurnAround,Stop};
	public static void main(String[] args) {
		RobotCommands[] route= {RobotCommands.Left,RobotCommands.Right, RobotCommands.Forward,RobotCommands.TurnAround, RobotCommands.Stop};
for (RobotCommands robotcommand: route){
	perform(robotcommand);
}
	}
	private static void perform(RobotCommands robotcommand) {
		switch (robotcommand) {
		case Left:
			System.out.println("left");
			break;
		case Right:
			System.out.println("right");
			break;
		case Forward:
			System.out.println("forward");
			break;
		case TurnAround:
			System.out.println("turn");
			break;
		case Stop:
			System.out.println("stop");
			break;
		
		default:
			break;
		}
	}

}
