package lesson140318.solitaire;

/*
 Simple Solitaire Card Game in Java
 Written by Tim Budd, Oregon State University, 1996
 */

import java.awt.*;
import java.applet.*;

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
		return suit() == heart || suit() == diamond ? red : black;
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
				g.drawLine(x + 45, y + 30, x + 25, y + 50);
				g.drawLine(x + 25, y + 50, x + 5, y + 30);
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

	public boolean isEmpty() {
		return firstCard == null;
	}

	public Card pop() { //LIFO
		Card result = null;
		if (firstCard != null) {
			result = firstCard;
			firstCard = firstCard.link;
			result.link = null;
		}
		return result;
	}

	// the following are sometimes overridden

	public boolean includes(int tx, int ty) { //proveryaet popal li klik mishkoi po stopke
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

class DeckPile extends CardPile { //zakritaya koloda

	DeckPile(int x, int y) {
		// first initialize parent
		super(x, y);
		// then create the new deck
		// first put them into a local pile
		CardPile pileOne = new CardPile(0, 0);
		CardPile pileTwo = new CardPile(0, 0);
		int count = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 12; j++) {
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
			while (!pileTwo.isEmpty()) {
				pileOne.addCard(pileTwo.pop());
			}
		}
	}

	@Override
	public void select(int tx, int ty) {
		if (isEmpty()) {
			return;
		}
		Solitaire.discardPile.addCard(pop()); //kladem iz zakritoi kolodi v otkrituy
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
		if (isEmpty()) {
			return;
		}
		Card topCard = pop(); //zabiraem karty iz zakritoi
		for (int i = 0; i < 4; i++) { //perebiraem stopki s mastyami
			if (Solitaire.suitPile[i].canTake(topCard)) { //mojet li stopka dlya sbrosa vzyat' karty  ///double
				Solitaire.suitPile[i].addCard(topCard); //do                                  ///double
				return;
			}
		}
		for (int i = 0; i < 7; i++) { // proveryaem stopki na stole
			if (Solitaire.tableau[i].canTake(topCard)) {  //мmojet li stopka na stole vzyat' karty    ///double
				Solitaire.tableau[i].addCard(topCard); //do                              ///double
				return;
			}
		}
		// nobody can use it, put it back on our list
		addCard(topCard); //vozvrashaem v ishodnyuy
	}
}

class SuitPile extends CardPile {

	SuitPile(int x, int y) {
		super(x, y);
	}

	@Override
	public boolean canTake(Card aCard) { //mojet li stopka vzyat' karty
		if (isEmpty()) {
			return isAce(aCard); //esli stopka pysta, to mojem polojit' tyz
		}
		Card topCard = top(); //
		return (aCard.suit() == topCard.suit()) //esli masti sovpadaut
				&& (aCard.rank() == 1 + topCard.rank()); //i znachenie karti na 1 men'she chem v stopke
	}

	private boolean isAce(Card aCard) {
		return aCard.rank() == 0;
	}
}

class TablePile extends CardPile { // karti na stole

	TablePile(int x, int y, int c) { // c - nomer v stopke i kolichestvo kart v nei, i posle togo kak polojili vse perevorachivaem veerhnuu kartu
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
		if (isEmpty()) {
			return isKing(aCard); //v pystyu stopky tol'ko korolya
		}
		Card topCard = top();
		return (aCard.color() != topCard.color()) //doljno bit' raznogo cveta
				&& (aCard.rank() == topCard.rank() - 1); // i znachenie karti na 1 men'she
	}

	private boolean isKing(Card aCard) {
		return aCard.rank() == 12;
	}

	@Override
	public boolean includes(int tx, int ty) {
		// don't test bottom of card
		return x <= tx && tx <= x + Card.width && y <= ty;
	}

	@Override
	public void select(int tx, int ty) { // metod vizivaetcya kogda kliknyli po karte, nahodyascheisya v stopke, i proveryaet kto ee mojet vzyat'
		if (isEmpty()) { 
			return;
		}

		// if face down, then flip
		Card topCard = top(); //ssilka na verhnuu karty
		if (!topCard.faceUp()) {
			topCard.flip(); 
			return;
		}

		// else see if any suit pile can take card
		topCard = pop();
		for (int i = 0; i < 4; i++) {
			if (Solitaire.suitPile[i].canTake(topCard)) {///double
				Solitaire.suitPile[i].addCard(topCard);  ///double
				return;
			}
		}
		// else see if any other table pile can take card
		for (int i = 0; i < 7; i++) {
			if (Solitaire.tableau[i].canTake(topCard)) {///double
				Solitaire.tableau[i].addCard(topCard);///double
				return;
			}
		}
		// else put it back on our pile
		addCard(topCard);
	}

	private int stackDisplay(Graphics g, Card aCard) { //recursion
		int localy; //=0
		if (aCard == null) {
			return y;  //y=80
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

@SuppressWarnings("serial")
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
		allPiles[0] = deckPile = new DeckPile(335, 5); //x i y, gde nachinaetsya otschet dlya risovaniya
		allPiles[1] = discardPile = new DiscardPile(268, 5);
		for (int i = 0; i < 4; i++) {
			allPiles[2 + i] = suitPile[i] = new SuitPile(15 + 60 * i, 5);
		}
		for (int i = 0; i < 7; i++) {
			allPiles[6 + i] = tableau[i] = new TablePile(5 + 55 * i, 80, i + 1); //kolichestvo kart v kajdoi stopke
		}
	}

	@Override
	public void paint(Graphics g) { //Graphics g - holst dlya risovaniya
		for (int i = 0; i < 13; i++) {
			allPiles[i].display(g);
		}
	}

	@Override
	public boolean mouseDown(Event evt, int x, int y) {
		for (int i = 0; i < 13; i++) {
			if (allPiles[i].includes(x, y)) {
				allPiles[i].select(x, y); //peremeschaet karty iz kliknytoi stopki
				repaint(); 
				return true;
			}
		}
		return true;
	}
}
