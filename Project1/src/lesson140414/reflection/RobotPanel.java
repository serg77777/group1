package lesson140414.reflection;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class RobotPanel extends JPanel {

	private Robot _r2d2;

	public RobotPanel(Robot r2d2) {
		_r2d2 = r2d2;
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D)g;
		
		g2D.fillOval(((Robot2D)_r2d2)._x, ((Robot2D)_r2d2)._y, 30, 30);
		
	}
	
}
