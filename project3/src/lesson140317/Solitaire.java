package lesson140317;

/*
 Simple Solitaire Card Game in Java
 Written by Tim Budd, Oregon State University, 1996
 */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;

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
		g.setColor(Color.black);
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
	private final int rank;
	private final int suit;
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
		// do nothing
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
		// first put them into a local pile
		CardPile pileOne = new CardPile(0, 0);
		CardPile pileTwo = new CardPile(0, 0);
		int count = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				pileOne.addCard(new Card(i, j));
				count++;
			}
		}
		// then pull them out randomly
		for (; count > 0; count--) {
			int limit = ((int) (Math.random() * 1000)) % count;
			// move down to a random location
			for (int i = 0; i < limit; i++) {
				pileTwo.addCard(pileOne.pop());
			}
			// then add the card found there
			addCard(pileOne.pop());
			// then put the decks back together
			while (!pileTwo.empty()) {
				pileOne.addCard(pileTwo.pop());
			}
		}
	}

	@Override
	public void select(int tx, int ty) {
		if (empty()) {
			while (!Solitaire.discardPile.empty()) {
				Card card = Solitaire.discardPile.pop();
				card.flip();
				addCard(card);
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
		return x <= tx && tx <= x + Card.width && y <= ty;
	}

	@Override
	public void select(int tx, int ty) {
		if (empty()) {
			return;
		}

		// if face down, then flip
		Card topCard = top();
		if (!topCard.faceUp()) {
			topCard.flip();
			return;
		}

		int maxHeight = y + Card.height / 2;
		
		CardPile copy = new CardPile(x, y);
		
		while (!empty()) {
			maxHeight += (Card.height / 2);
			copy.addCard(pop());;
		}
		while (!copy.empty()) {
			addCard(copy.pop());
		}		

		if (maxHeight >= ty && ty <= maxHeight - Card.height) {
			copy.addCard(pop());
		} else {
			while (ty < maxHeight - Card.height / 2) {
				copy.addCard(pop());
				maxHeight -= (Card.height/2);
			}
		}

		if (!copy.empty() && copy.top().faceUp()) {
			// else see if any suit pile can take card

			for (int i = 0; i < 4; i++) {
				if (Solitaire.suitPile[i].canTake(copy.top())) {
					while (!copy.empty()) {
						Solitaire.suitPile[i].addCard(copy.pop());
					}
					return;
				}
			}
			// else see if any other table pile can take card
			for (int i = 0; i < 7; i++) {
				if (Solitaire.tableau[i].canTake(copy.top())) {
					while (!copy.empty()) {
						Solitaire.tableau[i].addCard(copy.pop());
					}
					return;
				}
			}
		}
		// else put it back on our pile
		while (!copy.empty()) {
			addCard(copy.pop());
		}
	}

	private int stackDisplay(Graphics g, Card aCard) {
		int localy;
		if (aCard == null) {
			return y;
		}
		localy = stackDisplay(g, aCard.link);
		aCard.draw(g, x, localy);
		return localy + Card.height / 2;
	}

	@Override
	public void display(Graphics g) {
		stackDisplay(g, top());
	}

}

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
