package homework140428.roboannotations;

@RobotCommand(commands = "forward back stop left right")
public class SimpleRobot implements Robot {

	@Override
	public void forward() {
		System.out.println("Robot have moved forward");

	}

	@Override
	public void back() {
		System.out.println("Robot have moved backward");

	}

	@Override
	public void stop() {
		System.out.println("Robot have stopped");

	}

	@Override
	public void left() {
		System.out.println("Robot have turned left");

	}

	@Override
	public void right() {
		System.out.println("Robot have turned right");

	}

}
