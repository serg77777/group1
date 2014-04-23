package lesson140331;


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


   public static void main(String[] args) {
	JFrame frame = new JFrame("UI Example 2");
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JPanel panel = new JPanel();
	panel.setPreferredSize(new Dimension(400, 400));
	
//	JButton button = new JButton("click me");
//	
//	button.addActionListener(new ActionListener() {
//		
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			System.out.println("Clicked");
//		}
//	});
	
	
//	panel.add(button);
	
	panel.addMouseListener(new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			System.out.println("exited");
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			System.out.println("entered");
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println("Clicked at " + e.getX() + "," + e.getY() );
		}
	});
	
	panel.addMouseMotionListener(new MouseMotionListener() {
		
		@Override
		public void mouseMoved(MouseEvent e) {
		System.out.println("move at " + e.getX() + "," + e.getY());
			
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			System.out.println("drag at " + e.getX() + "," + e.getY());
			
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


   }
}
