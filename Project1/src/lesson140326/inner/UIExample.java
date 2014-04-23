package lesson140326.inner;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UIExample {

	private static final class ClickReaction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("Clicked");
		}
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		JPanel panel = new JPanel();
		panel.setSize(300, 300);
		panel.setPreferredSize(new Dimension(300, 300));
		
		JButton button = new JButton("Click me");
		button.addActionListener(new ClickReaction());
		
		panel.add(button);
		frame.add(panel);
		frame.pack();
		
		frame.setVisible(true);
	}
}
