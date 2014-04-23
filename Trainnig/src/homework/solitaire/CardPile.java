package homework.solitaire;

import java.awt.Color;
import java.awt.Graphics;

public abstract class CardPile implements Deck {

	CardPile(int xl, int yl) {
		x = xl;
		y = yl;
		length = Card.height;
		visible = true;
		firstCard = null;
		lastCard = null;
	}

	@Override
	public abstract void select(int tx, int ty);

	@Override
	public boolean canTake(Card aCard) {
		return false;
	}

	// access to cards are not overridden

	@Override
	public Card top() {
		return firstCard;
	}

	@Override
	public Card bottom() {
		return lastCard;
	}

	@Override
	public boolean empty() {
		return firstCard == null;
	}

	@Override
	public Card popTop() {
		Card result = null;
		if (firstCard != null) {
			result = firstCard;
			firstCard = firstCard.linkAft;
		}
		if (firstCard == null) {
			lastCard = null;
		} else {
			firstCard.linkFwd = null;
		}

		return result;
	}

	@Override
	public Card popBottom() {
		Card result = null;
		if (lastCard != null) {
			result = lastCard;
			lastCard = lastCard.linkFwd;
		}
		if (lastCard == null) {
			firstCard = null;
		} else {
			lastCard.linkAft = null;
		}
		return result;
	}

	// the following are sometimes overridden
	@Override
	public boolean includes(int tx, int ty) {
		return x <= tx && tx <= x + Card.width && y <= ty && ty <= y + length;
	}

	@Override
	public void addTopCard(Card card) {
		card.setCorner(x, y);
		card.clearLinks();
		if (empty()) {
			firstCard = card;
			lastCard = card;
			return;
		}
		card.linkAft = firstCard;
		firstCard.linkFwd = card;
		firstCard = card;
	}

	@Override
	public void addBottomCard(Card card) {
		card.setCorner(x, y);
		card.clearLinks();
		if (empty()) {
			firstCard = card;
			lastCard = card;
			return;
		}
		card.linkFwd = lastCard;
		lastCard.linkAft = card;
		lastCard = card;
	}

	public void display(Graphics g) {
		if (!visible) {
			return;
		}
		g.setColor(Color.black);
		if (firstCard == null) {
			g.drawRect(x, y, Card.width, Card.height);
		} else {
			firstCard.draw(g, x, y);
		}
	}

	// coordinates of the card pile
	protected int x;
	protected int y;
	protected int length;
	protected boolean visible;
	protected Card firstCard;
	protected Card lastCard;
	protected CardPile hostPile;

}
