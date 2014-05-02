package homework140317.solitaire;

import java.applet.Applet;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


@SuppressWarnings("serial")
public class Solitaire extends Applet {

	static DeckPile deckPile;
	static DiscardPile discardPile;
	static TablePile tableau[];
	static SuitPile suitPile[];
	static CardPile allPiles[];

	static boolean isAnyCardSelected = false;
	static Card selectedCard;
	static boolean isMultipleCardSelected = false;
	Image cardBack;

	public void init() {

		this.resize(400, 500);
	      
	    try {
			cardBack = ImageIO.read(new File("homework140317\\solitaire\\cardBack.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		// first allocate the arrays
		allPiles = new CardPile[13];
		suitPile = new SuitPile[4];
		tableau = new TablePile[7];
		// then fill them in
		allPiles[0] = deckPile = new DeckPile(335, 5);
		allPiles[1] = discardPile = new DiscardPile(268, 5);
		for (int i = 0; i < 4; i++)
			allPiles[2 + i] = suitPile[i] = new SuitPile(15 + 60 * i, 5);
		for (int i = 0; i < 7; i++)
			allPiles[6 + i] = tableau[i] = new TablePile(5 + 55 * i, 80, i + 1);
	}

	public void paint(Graphics g) {
		for (int i = 0; i < 13; i++)
			allPiles[i].display(g, cardBack);
//		g.drawImage(cardBack, 0, 300, null);
	}

	public boolean mouseDown(Event evt, int x, int y) {
		for (int i = 0; i < 13; i++)
			if (allPiles[i].includes(x, y)) {
				allPiles[i].performAction(x, y);
				repaint();
				return true;
			}
		return true;
	}
}