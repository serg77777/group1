package lesson140414.reflection;

public class SimpleRobot implements Robot {

	@Override
	@RobotCommand(command = "forward")
	public void forward() {

		System.out.println("Moved forward");
	}

	@Override
	@RobotCommand(command = "backward")
	public void backward() {

		System.out.println("Moved backward");
	}

	@Override
	@RobotCommand(command = "stop")
	public void stop() {

		System.out.println("Stopped");
	}

	@Override
	@RobotCommand(command = "left")
	public void left() {

		System.out.println("Turned left");
	}

	@Override
	@RobotCommand(command = "right")
	public void right() {

		System.out.println("Turned right");
	}

}
