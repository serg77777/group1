package lesson140415.invoke;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Dispatcher implements CommandListener {

		private List<Robot> _robots = new ArrayList<>();
		
		public void add(Robot robot) {
			_robots.add(robot);
		}

		@Override
		public void command(String command) {
			System.out.println("dispatch " + command);
			if (command == null) {
				return;
			}
		OUTER: for (Robot robot : _robots) {
				System.out.println(robot.getClass().getSimpleName());
				Class robotClass = robot.getClass();
				Method[] methods = robotClass.getMethods();
				for (Method method : methods) {
					if (method.getName().equals(command)) {
						try {
							method.invoke(robot, new Object[]{});
							continue OUTER;
						} catch (IllegalAccessException	| IllegalArgumentException
								| InvocationTargetException e) {
							e.printStackTrace();
						}
					}
				}
				System.out.println("unknown comamnd" + command);
//				switch (command) {
//				case "up":
//					robot.up();
//					break;
//				case "down":
//					robot.down();
//					break;
//				case "right":
//					robot.right();
//					break;
//				case "left":
//					robot.left();
//					break;
//				case "stop":
//					robot.stop();
//					break;
//					default:
//						System.out.println("unknown comamnd" + command);
//				}
//			if (command.equals("up")) {
//				_robot.up();
//			}else if (command.equals("down")) {
//				_robot.down();
//			} ...
			}
		}
	}