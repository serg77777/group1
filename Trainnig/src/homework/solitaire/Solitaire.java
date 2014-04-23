package homework.solitaire;

import java.applet.Applet;
import java.awt.Event;
import java.awt.Graphics;

public class Solitaire extends Applet {

	static Card selectedCard;
	static CardPile selectedPile;
	static DeckPile deckPile;
	static DiscardPile discardPile;
	static SelectionPile selectionPile;
	static TablePile tableau[];
	static SuitPile suitPile[];
	static CardPile allPiles[];

	@Override
	public void init() {

		// first allocate the arrays
		allPiles = new CardPile[14];
		suitPile = new SuitPile[4];
		tableau = new TablePile[7];
		// then fill them in
		allPiles[0] = selectionPile = new SelectionPile(-100, -100);
		allPiles[1] = deckPile = new DeckPile(335, 5);
		allPiles[2] = discardPile = new DiscardPile(268, 5);
		for (int i = 0; i < 4; i++) {
			allPiles[3 + i] = suitPile[i] = new SuitPile(15 + 60 * i, 5);
		}
		for (int i = 0; i < 7; i++) {
			allPiles[7 + i] = tableau[i] = new TablePile(5 + 55 * i, 80, i + 1);
		}
	}

	static boolean gameWon() {

		boolean result = true;
		for (CardPile pile : suitPile) {
			if (pile.empty()) {
				return false;
			}
			result = result && (pile.top().rank() == 12);
		}
		return result;
	}

	@Override
	public void paint(Graphics g) {

		for (int i = 1; i < 14; i++) {
			allPiles[i].display(g);
		}
		selectionPile.display(g);
	}

	@Override
	public boolean mouseDown(Event evt, int x, int y) {

		int clicks = evt.clickCount;
		// System.out.println("Num of Clicks: " + clicks);
		if (clicks == 1) {
			for (int i = 0; i < 14; i++) {
				if (allPiles[i].includes(x, y)) {
					allPiles[i].select(x, y);
				}
			}
		}
		if (clicks == 2) {
			selectionPile.selectDoubleClick();
		}
		repaint();
		if (gameWon()) {
			System.out.println("Game Won!");
			System.exit(0);
		}
		return true;
	}
}
