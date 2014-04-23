package lesson140415.invoke;

import java.awt.Dimension;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;


public class RobotControlPanal {
	
	public static void main(String[] args) {
		
		System.out.println("start");
		SimpleRobot robot = new SimpleRobot();
		Robot2d r2d2 = new Robot2d(100,100);
		
		Dispatcher dispather =new Dispatcher();
		dispather.add(robot);
		dispather.add(r2d2);
		
		ControlCenter center= new ControlCenter(dispather);
		
		new Thread(center).start();
		
		startKeyboardInterface(center);
		
		//startGraphics(r2d2);
		
	}

	private static void startGraphics(Robot2d robot) {
		JFrame frame = new JFrame("Robot control panel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		robot.setPreferredSize(new Dimension(600,600));
		frame.add(robot);
		
		frame.pack();
		frame.setVisible(true);
		
		while(true) {
			robot.repaint();
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void startKeyboardInterface(final CommandListener listener) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				Scanner scanner = new Scanner(System.in);
				try {
				while(scanner.hasNextLine()){
					String command = scanner.nextLine();
					listener.command(command);
				}
				}
				finally {
					if(scanner != null) {
						scanner.close();
					}
				}
			}
		}).start();
		
	}
	
}
