package lesson140326.inner;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class UIExample {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("UI Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(400,400));
			
//		JButton button = new JButton("Click me");
//		button.addActionListener(new ActionListener() {			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("clicked!");				
//			}
//		});
//		panel.add(button);
		
		panel.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {			
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {			
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {				
				System.out.println("exit");
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				System.out.println("enter");
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("clicked at " + arg0.getX() + ", " + arg0.getY());
			}
		});
		
		panel.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent arg0) {
				System.out.println("move at " + arg0.getX() + ", " + arg0.getY());
			}
			
			@Override
			public void mouseDragged(MouseEvent arg0) {
				System.out.println("drag at " + arg0.getX() + ", " + arg0.getY());
			}
		});
		
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("Mouse pressed");
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("Mouse released");
			}
		});
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}

}
