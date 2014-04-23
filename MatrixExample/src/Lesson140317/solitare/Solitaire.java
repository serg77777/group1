package Lesson140317.solitare;

/*
 Simple Solitaire Card Game in Java
 Written by Tim Budd, Oregon State University, 1996
 */

import java.applet.Applet;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Solitaire extends Applet {
	static DeckPile deckPile;
	static DiscardPile discardPile;
	static TablePile tableau[];
	static SuitPile suitPile[];
	static CardPile allPiles[];
	protected static BufferedImage img = null;
	

	public void init() {
		this.setSize(495, 410);
		this.getBackground();
		try {
			Solitaire.img = ImageIO
					.read(new File(
							"C:\\Users\\Stepan\\workspace\\MatrixExample\\src\\Lesson140317\\card_red.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// first allocate the arrays
		allPiles = new CardPile[13];
		suitPile = new SuitPile[4];
		tableau = new TablePile[7];
		// then fill them in
		allPiles[0] = deckPile = new DeckPile(5, 5);
		allPiles[1] = discardPile = new DiscardPile(75, 5);
		for (int i = 0; i < 4; i++)
			allPiles[2 + i] = suitPile[i] = new SuitPile(215 + 70 * i, 5);
		for (int i = 0; i < 7; i++)
			allPiles[6 + i] = tableau[i] = new TablePile(5 + 70 * i, 105, i + 1);
	}

	public void paint(Graphics g) {
		for (int i = 0; i < 13; i++)
			allPiles[i].display(g);
	}

	public boolean mouseDown(Event evt, int x, int y) {
		for (int i = 0; i < 13; i++)
			if (allPiles[i].includes(x, y)) {
				allPiles[i].select(x, y);
				repaint();
				return true;
			}
		return true;
	}
	@Override
	public boolean mouseMove(Event evt, int x, int y) {
		for (int i = 0; i < 13; i++)
			if (allPiles[i].includes(x, y)) {
				allPiles[i].move(x, y);
//				repaint();
				return true;
			}
		return true;
	}
}
