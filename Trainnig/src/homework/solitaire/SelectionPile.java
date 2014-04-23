package homework.solitaire;

import java.awt.Graphics;

public class SelectionPile extends CardPile {

	public SelectionPile(int x, int y) {

		super(x, y);
		visible = false;
	}

	@Override
	public void select(int tx, int ty) {

		flush();
	}

	@Override
	public void addBottomCard(Card card) {

		y = card.cornerY();
		if (!empty()) {
			length += 35;
		}
		super.addBottomCard(card);
		card.select();
	}

	@Override
	public Card popBottom() {

		Card result = super.popBottom();
		if (!empty()) {
			length -= 35;
		}
		result.select();
		return result;
	}

	public void fill(CardPile pile, Card selectedCard) {

		flush();
		x = selectedCard.cornerX();
		visible = true;
		hostPile = pile;
		Card card = hostPile.top();
		do {
			card = hostPile.popTop();
			addBottomCard(card);
		} while (!card.equals(selectedCard));
	}

	public void flush(CardPile pile) {

		while (!empty()) {
			pile.addTopCard(popBottom());
		}
		x = -100;
		y = -100;
		visible = false;
	}

	public void flush() {

		flush(hostPile);
	}

	private boolean hasOneCard() {

		if (empty()) {
			return false;
		} else {
			return firstCard == lastCard;
		}
	}

	public void suitPileSelected(CardPile pile) {

		if (hasOneCard()) {
			flushToTablePile(pile);
		}
	}

	public boolean flushToTablePile(CardPile pile) {

		if (empty()) {
			return false;
		}
		if (pile.canTake(bottom())) {
			flush(pile);
			return true;
		} else {
			flush();
			return false;
		}
	}

	private int stackDisplay(Graphics g, Card aCard) {

		int localy;
		if (aCard == null) {
			return y;
		}
		localy = stackDisplay(g, aCard.linkAft);
		aCard.draw(g, x, localy);
		return localy + 35;
	}

	@Override
	public void display(Graphics g) {

		stackDisplay(g, top());
	}

	public void selectDoubleClick() {

		if (empty()) {
			return;
		}
		if (hasOneCard()) {
			for (int i = 0; i < 4; i++) {
				if (Solitaire.suitPile[i].canTake(bottom())) {
					flush(Solitaire.suitPile[i]);
					return;
				}
			}
			for (int i = 0; i < 7; i++) {
				if (Solitaire.tableau[i].canTake(bottom())) {
					flush(Solitaire.tableau[i]);
					return;
				}
			}
		}
	}
}
