package lesson140414.reflection;

public class Robot2D implements Robot {

	int _x;
	int _y;
	final static int VX = 10;
	final static int VY = 10;

	public Robot2D(int x, int y) {

		_x = x;
		_y = y;
	}

	@Override
	@RobotCommand(command = "forward")
	public void forward() {

		_y -= VY;
	}

	@Override
	@RobotCommand(command = "backward")
	public void backward() {

		_y += VY;
	}

	@Override
	@RobotCommand(command = "stop")
	public void stop() {

	}

	@Override
	@RobotCommand(command = "left")
	public void left() {

		_x -= VX;
	}

	@Override
	@RobotCommand(command = "right")
	public void right() {

		_x += VX;
	}
}
