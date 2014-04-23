package Lesson140317.solitare;

import java.awt.Graphics;

public class TablePile extends CardPile {

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

	public boolean canTake(Card aCard) {
		if (empty())
			return aCard.rank() == 12;
		Card topCard = top();
		return (aCard.color() != topCard.color())
				&& (aCard.rank() == topCard.rank() - 1);
	}

	public boolean includes(int tx, int ty) {
		return top().x <= tx && tx <= top().x + Card.width && top().y <= ty  && ty <= top().y;
	}

	public void select(int tx, int ty) {
		if (empty()) {
			return;
		}
		
			System.out.println(top().suit() + " " + top().rank());
		// if face down, then flip
		Card topCard = top();
		if (!topCard.faceUp()) {
			topCard.flip();
			return;
		}

		// else see if any suit pile can take card
		topCard = pop();
		for (int i = 0; i < 4; i++)
			if (Solitaire.suitPile[i].canTake(topCard)) {
				Solitaire.suitPile[i].addCard(topCard);
				return;
			}
		// else see if any other table pile can take card
		for (int i = 0; i < 7; i++)
			if (Solitaire.tableau[i].canTake(topCard)) {
				Solitaire.tableau[i].addCard(topCard);
				return;
			}
		// else put it back on our pile
		addCard(topCard);
	}

	private int stackDisplay(Graphics g, Card aCard) {
		int localy;
		if (aCard == null)
			return y;
		localy = stackDisplay(g, aCard.link);
		aCard.x = x;
		aCard.y = y + localy;
		aCard.draw(g, x, localy);
		System.out.println(aCard);
		return localy + 35;
	}

	public void display(Graphics g) {
		stackDisplay(g, top());
	}

}
