package lesson140414.reflection;

import java.awt.Dimension;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;

public class RobotControlPanel {

	public interface CommandListener {

		void command(String command);
	}

	static class ControlBlock implements CommandListener {

		private String _command;

		@Override
		public void command(String command) {

			_command = command;
		}

		public String getCommand() {

			return _command;
		}

		public void setCommand(String command) {

			_command = command;
		}

		public void controlRobot(Robot robot) {

			// do nothing
		}
	}

	public static void main(String[] args) {

		ControlBlock block = new ControlBlock();
		Robot robot = new SimpleRobot();
		initKeyboardControl(block);
		control(block, robot);

		Robot2D r2d2 = new Robot2D(50, 50);
		control(block, r2d2);
		visualize(r2d2);
	}

	private static void visualize(Robot2D r2d2) {

		JFrame frame = new JFrame("Robot2d example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RobotPanel panel = new RobotPanel(r2d2);
		panel.setPreferredSize(new Dimension(400, 400));
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);

		while (true) {
			panel.repaint();
			pause(1);
		}
	}

	private static void initKeyboardControl(
			final CommandListener commandListener) {

		new Thread(new Runnable() {

			@Override
			public void run() {

				Scanner scanner = new Scanner(System.in);
				try {
					while (scanner.hasNextLine()) {
						String command = scanner.nextLine();
						commandListener.command(command);
					}
				} finally {
					scanner.close();
				}
			}
		}).start();
	}

	private static void control(final ControlBlock block, final Robot robot) {

		new Thread(new Runnable() {

			@Override
			public void run() {

				while (true) {
					String command = block.getCommand();
					processCommand(command, robot);
					block.controlRobot(robot);
					pause(2);
				}
			}
		}).start();
	}

	private static void pause(int pause) {

		try {
			TimeUnit.SECONDS.sleep(pause);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void processCommand(String command, Robot robot) {

		if (command == null) {
			return;
		}
		if (robot == null) {
			throw new IllegalArgumentException("No robot!");
		}
		Class<? extends Robot> robotClass = robot.getClass();
		Method[] methods = robotClass.getMethods();
		// TODO: вместо имени метода искать по аннотации
		for (Method method : methods) {
			String name = method.getName();
			if (name.equals(command)) {
				try {
					method.invoke(robot, new Object[] {});
					return;
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
