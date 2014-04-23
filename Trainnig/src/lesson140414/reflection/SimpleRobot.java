package lesson140414.reflection;

public class SimpleRobot implements Robot {

	@Override
	public void forward() {

		System.out.println("Moved forward");
	}

	@Override
	public void backward() {

		System.out.println("Moved backward");
	}

	@Override
	public void stop() {

		System.out.println("Stopped");
	}

	@Override
	public void left() {

		System.out.println("Turned left");
	}

	@Override
	public void right() {

		System.out.println("Turned right");
	}

}
