package lesson140401.localinner;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class UIExample2 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("UI Example 2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(400, 400));
		
		panel.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("released "+e.getX()+","+e.getY());
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("pressed "+e.getX()+","+e.getY());
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("exited");
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("entered");
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Clicked "+e.getX()+","+e.getY());
				
			}
		});
		
		panel.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Moved "+e.getX()+","+e.getY());
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				System.out.println("Dragged "+e.getX()+","+e.getY());
				// TODO Auto-generated method stub
				
			}
		});
		
		
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				// TODO Auto-generated method stub
			
				System.out.println("Wheel "+e.getX()+","+e.getY());
			
			}
			
			@Override
			public void mouseClicked(MouseEvent e){
				System.out.println(e.getButton());
			}
		});
		
		
		frame.add(panel);
		
		frame.pack();
		
		frame.setVisible(true);
		
		
		
	}
	
}
