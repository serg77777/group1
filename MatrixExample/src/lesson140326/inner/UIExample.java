package lesson140326.inner;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UIExample {

	private static final class ActionListenerImplementation implements
			ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Clicked!");
		}
	}

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(300, 300);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(400,400));
		
		panel.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("clicked!" + e.getX());
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("entered");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("exited");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		panel.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println("move at " + e.getX() + " " + e.getY());
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				System.out.println("drag at " + e.getX() + " " + e.getY());
				
			}
		});
		
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("mouse pressed");
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("mouse released");
			}
		});
		
		frame.add(panel);
		
		frame.pack();

		frame.setVisible(true);
		
		
		
//		JButton button = new JButton("Click me!");
//		
//		button.addActionListener(new ActionListenerImplementation());
//		frame.add(button);
		
	}
}
