package lesson140331.innerlocal;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

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

				System.out.println("Mouse released!");
			}

			@Override
			public void mousePressed(MouseEvent e) {

				System.out.println("Mouse pressed!");
			}

			@Override
			public void mouseExited(MouseEvent e) {

				System.out.println("Mouse exited!");
			}

			@Override
			public void mouseEntered(MouseEvent e) {

				System.out.println("Mouse entered!");
			}

			@Override
			public void mouseClicked(MouseEvent e) {

				System.out.println("Clicked at: " + e.getX() + "@" + e.getY());
			}
		});
		panel.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseMoved(MouseEvent e) {

				System.out.println("Moves at: " + e.getX() + "@" + e.getY());

			}

			@Override
			public void mouseDragged(MouseEvent e) {

				System.out.println("Drags at: " + e.getX() + "@" + e.getY());
			}
		});
		panel.addMouseListener(new MouseAdapter() {
		});

		frame.add(panel);
		frame.pack();
		frame.setVisible(true);

	}
}
