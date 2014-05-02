package homework140428.roboannotations;

import java.awt.Dimension;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;

import lesson140428.annotations.MyAnno;

public class RobotControlPanel {



	static class ControlBlock implements CommandListener{
		private String _command;
		@Override
		public void command(String command) {
			_command = command;
			
		}
		public String getCommand() {
			return _command;
		}

		public void controlRobot(Robot robot) {
			
		}
	}
	


	interface CommandListener {
		void command(String command);
	}

	public static void main(String[] args) {
		
		System.out.println("start");

		Robot robot = new SimpleRobot();
		ControlBlock block = new ControlBlock();
		
		
		initKeyboardControl(block );
		control(block, robot);
		
		
		Robot2D r2d2 = new Robot2D(50,50);

		control(block, (Robot)r2d2);
		visualize(r2d2);

	}

	private static void visualize(Robot2D r2d2) {
		JFrame frame = new JFrame("Robot2D example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RobotPanel panel = new RobotPanel(r2d2);
		panel.setPreferredSize(new Dimension(400,400));
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		
		while(true) {
			panel.repaint();
			pause(1);
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

	private static void control(final ControlBlock block, final Robot robot) {
		new Thread(new Runnable() {
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

	private static void pause(int time) {
		try {
			TimeUnit.SECONDS.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}


	private static void processCommand(String command, Robot robot) {
		if (command == null) {
			return;
		}
		if (robot == null) {
			throw new IllegalArgumentException();
		}
		
		
		Class robotClass = robot.getClass();
		RobotCommand availableCommandsList = (RobotCommand) robotClass.getAnnotation(RobotCommand.class);
		if(availableCommandsList.commands().contains(command)) {
			try {
				robotClass.getMethod(command).invoke(robot, new Object[]{});
			} catch (IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException
					| SecurityException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Unknown command: "+command);
		}
		
	}

}
