package lesson140326.inner;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UIExample {

	private static final class ActionListenerImplementation implements
			ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("clicked");
		}
	}

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(400,400));

		JButton button = new JButton("Click me!");	
		button.addActionListener(new ActionListenerImplementation());

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
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
		System.out.println("clicked!");		
			}
		});
		
		frame.add(panel);
		
		
		frame.pack();
		
		frame.setVisible(true);
	}
	
}
