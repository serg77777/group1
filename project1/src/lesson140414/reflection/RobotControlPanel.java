package lesson140414.reflection;

import java.awt.Dimension;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;

public class RobotControlPanel {

	interface CommandListener {

		void command(String command);
	}

	static class ControlBlock implements CommandListener {

		private String _command;

		@Override
		public void command(String command) {

			_command = command;

			// TODO Auto-generated method stub

		}

		public String getCommand() {

			return _command;
		}

		public void controlRobot(Robot robot) {

			/*
			 * public void setCommand(String command) {
			 * 
			 * _command = command; }
			 */

		}

		static class GraphicsControlBlock extends ControlBlock {

			@Override
			public void controlRobot(Robot robot) {

			}

			public static void main(String[] args) {

				System.out.println("start");
				Robot r2d2 = new Robot2D(50, 50);

				Robot robot = new SimpleRobot();
				ControlBlock block = new ControlBlock();
				initKeyboardControl(block);
				control(block, robot);

				visualize(r2d2);
				GraphicsControlBlock gBlock = new GraphicsControlBlock();
				control(gBlock, r2d2);

			}

			private static void visualize(Robot2D r2d2) {

				JFrame frame = new JFrame("Robot2D example");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				RobotPanel panel = new RobotPanel(r2d2);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				panel.setPreferredSize(new Dimension(400, 400));
				frame.add(panel);
				frame.pack();
				frame.setVisible(true);
				while (true) {
					panel.repaint();
					pause(1);
				}
			}

		}

		private static void initKeyboardControl(
				final CommandListener commandListener) {

			new Thread(new Runnable() {

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

		private static void control(ControlBlock block, Robot robot) {

			new Thread(new Runnable() {

				public void run() {

					while (true) {
						String command = block.getCommand();
						processCommand(command, robot);
						block.controlRobot(robot);
						pause();
					}

				}
			}).start();
		}

		private static void pause(int seconds) {

			try {
				TimeUnit.SECONDS.sleep(seconds);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		private static void processCommand(String command, Robot robot) {

			if (command == null) {
				return;
			}
			if (robot == null) {
				throw new IllegalArgumentException("no robot");
			}

			Class robotClass = robot.getClass();
			Method[] methods = robotClass.getMethods();
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
			System.out.println("Unknown comm " + command);

			// if ("forward".equals(command)) {
			// robot.forward();
			// }
			/*
			 * switch (command) { case "forward": robot.forward(); break; case
			 * "back": robot.back(); break; case "left": robot.Left(); break;
			 * case "stop": robot.stop(); break; default:
			 * System.out.println("unknown command " + command);
			 * 
			 * }
			 */
		}
	}
}
