package lesson140415.invoke;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Robot2d extends JPanel implements Robot {

	private static final int DY = 10;
	private static final int DX = 10;
	private int _x;
	private int _y;
	public Robot2d(int x, int y){
		
		_x = x;
		_y = y;
		
	}
	


	public int get_x() {
		return _x;
	}

	public int get_y() {
		return _y;
	}

	@Override
	public void up() {
		// TODO Auto-generated method stub
		_y -= DY;
		
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		_y +=DY;
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		_x -= DX;
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		_x += DX;
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.fillOval(_x,  _y, 30, 30);
		
		
		
	}
	
	
	
}
