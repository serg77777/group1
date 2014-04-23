package lesson140414.reflection;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class RobotPanel extends JPanel {

	private Robot2D _robot;

	public RobotPanel(Robot2D r2d2) {

		_robot = r2d2;
	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.fillOval(_robot._x, _robot._y, 30, 30);
	}
}
