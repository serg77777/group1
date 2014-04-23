package lesson140317;

/*
 Simple Solitaire Card Game in Java
 Written by Tim Budd, Oregon State University, 1996
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Card {
	// constructor
	Card(int sv, int rv) {
		suit = sv;
		rank = rv;
		faceup = false;
	}

	// access attributes of card
	public int rank() {
		return rank;
	}

	public int suit() {
		return suit;
	}

	public boolean faceUp() {
		return faceup;
	}

	public void flip() {
		faceup = !faceup;
	}

	public void select() {
		selected = !selected;
		// System.out.println(selected);
	}

	public int color() {
		if (suit() == heart || suit() == diamond) {
			return red;
		}
		return black;
	}

	public void draw(Graphics g, int x, int y) {
		String names[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K" };
		// clear rectangle, draw border
		g.clearRect(x, y, width, height);
		if (selected()) {
			g.setColor(Color.yellow);
		} else {
			g.setColor(Color.black);
		}
		g.drawRect(x, y, width, height);
		// draw body of card
		if (faceUp()) {
			if (color() == red) {
				g.setColor(Color.red);
			} else {
				g.setColor(Color.blue);
			}
			g.drawString(names[rank()], x + 3, y + 15);
			if (suit() == heart) {
				g.drawLine(x + 25, y + 30, x + 35, y + 20);
				g.drawLine(x + 35, y + 20, x + 45, y + 30);
				g.drawLine(x + 45, y + 30, x + 25, y + 60);
				g.drawLine(x + 25, y + 60, x + 5, y + 30);
				g.drawLine(x + 5, y + 30, x + 15, y + 20);
				g.drawLine(x + 15, y + 20, x + 25, y + 30);
			} else if (suit() == spade) {
				g.drawLine(x + 25, y + 20, x + 40, y + 50);
				g.drawLine(x + 40, y + 50, x + 10, y + 50);
				g.drawLine(x + 10, y + 50, x + 25, y + 20);
				g.drawLine(x + 23, y + 45, x + 20, y + 60);
				g.drawLine(x + 20, y + 60, x + 30, y + 60);
				g.drawLine(x + 30, y + 60, x + 27, y + 45);
			} else if (suit() == diamond) {
				g.drawLine(x + 25, y + 20, x + 40, y + 40);
				g.drawLine(x + 40, y + 40, x + 25, y + 60);
				g.drawLine(x + 25, y + 60, x + 10, y + 40);
				g.drawLine(x + 10, y + 40, x + 25, y + 20);
			} else if (suit() == club) {
				g.drawOval(x + 20, y + 25, 10, 10);
				g.drawOval(x + 25, y + 35, 10, 10);
				g.drawOval(x + 15, y + 35, 10, 10);
				g.drawLine(x + 23, y + 45, x + 20, y + 55);
				g.drawLine(x + 20, y + 55, x + 30, y + 55);
				g.drawLine(x + 30, y + 55, x + 27, y + 45);
			}
		} else { // face down
			g.setColor(Color.yellow);
			g.drawLine(x + 15, y + 5, x + 15, y + 65);
			g.drawLine(x + 35, y + 5, x + 35, y + 65);
			g.drawLine(x + 5, y + 20, x + 45, y + 20);
			g.drawLine(x + 5, y + 35, x + 45, y + 35);
			g.drawLine(x + 5, y + 50, x + 45, y + 50);
		}
	}

	public boolean selected() {

		return selected;
	}

	// data fields for colors and suits
	final static int width = 50;
	final static int height = 70;
	final static int red = 0;
	final static int black = 1;
	final static int heart = 0;
	final static int spade = 1;
	final static int diamond = 2;
	final static int club = 3;
	// private static String names[] = {"A", "2", "3", "4", "5", "6",
	// "7", "8", "9", "10", "J", "Q", "K"};
	// data fields
	private boolean faceup;
	private boolean selected;
	private int rank;
	private int suit;
	public Card link;
}

class CardPile {

	CardPile(int xl, int yl) {
		x = xl;
		y = yl;
		firstCard = null;
	}

	// access to cards are not overridden

	public Card top() {
		return firstCard;
	}

	public boolean empty() {
		return firstCard == null;
	}

	public Card pop() {
		Card result = null;
		if (firstCard != null) {
			result = firstCard;
			firstCard = firstCard.link;
		}
		return result;
	}

	// the following are sometimes overridden

	public boolean includes(int tx, int ty) {
		return x <= tx && tx <= x + Card.width && y <= ty
				&& ty <= y + Card.height;
	}

	public void select(int tx, int ty) {

	}

	public void deselect() {
		if (hasSelected()) {
			top().select();
		}
	}

	public void addCard(Card aCard) {
		aCard.link = firstCard;
		firstCard = aCard;
	}

	public void display(Graphics g) {
		g.setColor(Color.black);
		if (firstCard == null) {
			g.drawRect(x, y, Card.width, Card.height);
		} else {
			firstCard.draw(g, x, y);
		}

	}

	public boolean canTake(Card aCard) {
		return false;
	}

	public boolean hasSelected() {
		if (empty()) {
			return false;
		}
		return top().selected();
	}

	// coordinates of the card pile
	protected int x;
	protected int y;
	private Card firstCard;
}

class DeckPile extends CardPile {
	DeckPile(int x, int y) {
		// first initialize parent
		super(x, y);
		// then create the new deck
		List<int[]> rawDeck = new ArrayList<int[]>();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				int[] rawCard = { i, j };
				rawDeck.add(rawCard);
			}
		}
		// shuffle mock deck
		Collections.shuffle(rawDeck);
		// and form true deck
		for (int[] rawCard : rawDeck) {
			addCard(new Card(rawCard[0], rawCard[1]));
		}
	}

	@Override
	public void select(int tx, int ty) {
		if (empty()) {
			while (!Solitaire.discardPile.empty()) {
				addCard(Solitaire.discardPile.pop());
			}
			return;
		}
		Solitaire.discardPile.addCard(pop());
	}
}

class DiscardPile extends CardPile {

	DiscardPile(int x, int y) {
		super(x, y);
	}

	@Override
	public void addCard(Card aCard) {
		if (!aCard.faceUp()) {
			aCard.flip();
		}
		super.addCard(aCard);
	}

	@Override
	public void select(int tx, int ty) {
		if (empty()) {
			return;
		}
		boolean wasSelected = top().selected();
		Solitaire.deselectAll();
		if (!wasSelected) {
			top().select();
		}
	}

	public void doubleClicked() {
		if (empty()) {
			return;
		}
		Card topCard = pop();

		for (int i = 0; i < 4; i++) {
			if (Solitaire.suitPile[i].canTake(topCard)) {
				Solitaire.suitPile[i].addCard(topCard);
				return;
			}
		}
		for (int i = 0; i < 7; i++) {
			if (Solitaire.tableau[i].canTake(topCard)) {
				Solitaire.tableau[i].addCard(topCard);
				return;
			}
		}
		// nobody can use it, put it back on our list
		addCard(topCard);
	}
}

class SuitPile extends CardPile {

	SuitPile(int x, int y) {
		super(x, y);
	}

	public void select() {
		Card topCard;
		for (int i = 0; i < 13; i++) {
			if (Solitaire.allPiles[i].hasSelected()) {
				topCard = Solitaire.allPiles[i].top();
				if (canTake(topCard)) {
					topCard.select();
					addCard(Solitaire.allPiles[i].pop());
					return;
				}
				topCard.select();
			}
		}
	}

	@Override
	public boolean canTake(Card aCard) {
		if (empty()) {
			return aCard.rank() == 0;
		}
		Card topCard = top();
		return (aCard.suit() == topCard.suit())
				&& (aCard.rank() == 1 + topCard.rank());
	}
}

class TablePile extends CardPile {

	TablePile(int x, int y, int c) {
		// initialize the parent class
		// super() call must be the first in constructor
		super(x, y);
		// then initialize our pile of cards
		for (int i = 0; i < c; i++) {
			addCard(Solitaire.deckPile.pop());
		}
		// flip topmost card face up
		top().flip();
	}

	@Override
	public boolean canTake(Card aCard) {
		if (empty()) {
			return aCard.rank() == 12;
		}
		Card topCard = top();
		return (aCard.color() != topCard.color())
				&& (aCard.rank() == topCard.rank() - 1);
	}

	@Override
	public boolean includes(int tx, int ty) {
		// don't test bottom of card
		// TODO: переделать для выбора любой карты, для клика только на карту
		return x <= tx && tx <= x + Card.width && y <= ty;
	}

	@Override
	public void select(int tx, int ty) {
		Card topCard = null;
		for (int i = 0; i < 13; i++) {
			if (Solitaire.allPiles[i].hasSelected()) {
				topCard = Solitaire.allPiles[i].top();
				if (canTake(topCard)) {
					topCard.select();
					addCard(Solitaire.allPiles[i].pop());
					return;
				}
				topCard.select();
			}
		}
		if (empty()) {
			return;
		}

		// if face down, then flip
		topCard = top();
		if (!topCard.faceUp()) {
			topCard.flip();
			return;
		}
	}

	private int stackDisplay(Graphics g, Card aCard) {
		int localy;
		if (aCard == null) {
			return y;
		}
		localy = stackDisplay(g, aCard.link);
		aCard.draw(g, x, localy);
		return localy + 35;
	}

	@Override
	public void display(Graphics g) {
		stackDisplay(g, top());
	}

}

// TODO: допилить пасьянс до полноценного
public class Solitaire extends Applet {
	static DeckPile deckPile;
	static DiscardPile discardPile;
	static TablePile tableau[];
	static SuitPile suitPile[];
	static CardPile allPiles[];

	@Override
	public void init() {
		// first allocate the arrays
		allPiles = new CardPile[13];
		suitPile = new SuitPile[4];
		tableau = new TablePile[7];
		// then fill them in
		allPiles[0] = deckPile = new DeckPile(335, 5);
		allPiles[1] = discardPile = new DiscardPile(268, 5);
		for (int i = 0; i < 4; i++) {
			allPiles[2 + i] = suitPile[i] = new SuitPile(15 + 60 * i, 5);
		}
		for (int i = 0; i < 7; i++) {
			allPiles[6 + i] = tableau[i] = new TablePile(5 + 55 * i, 80, i + 1);
		}
	}

	static void deselectAll() {
		for (CardPile pile : allPiles) {
			pile.deselect();
		}
	}

	@Override
	public void paint(Graphics g) {
		for (int i = 0; i < 13; i++) {
			allPiles[i].display(g);
		}
	}

	@Override
	public boolean mouseDown(Event evt, int x, int y) {
		for (int i = 0; i < 13; i++) {
			if (allPiles[i].includes(x, y)) {
				allPiles[i].select(x, y);
				repaint();
				return true;
			}
		}
		return true;
	}
}
