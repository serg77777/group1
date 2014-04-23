package homework.solitaire;

public class TablePile extends SelectionPile {

	public TablePile(int x, int y, int c) {
		super(x, y);
		for (int i = 0; i < c; i++) {
			addTopCard(Solitaire.deckPile.popTop());
		}
		top().flip();
	}

	@Override
	public boolean includes(int tx, int ty) {
		return x <= tx && tx <= x + Card.width && y <= ty;
	}

	@Override
	public void select(int tx, int ty) {
		if (Solitaire.selectionPile.flushToTablePile(this)) {
			return;
		}
		if (!empty()) {
			Solitaire.selectionPile.flush();
			if (!top().faceUp()) {
				top().flip();
				return;
			}
			Card selectedCard = null;
			Card card = top();
			do {
				if (card.isSelectable(ty)) {
					selectedCard = card;
					break;
				}
				card = card.linkAft;
			} while (card != null);
			if (selectedCard != null) {
				Solitaire.selectionPile.fill(this, selectedCard);
			}
		}
	}

	@Override
	public void addTopCard(Card card) {
		int ty = y;
		if (!empty()) {
			ty = firstCard.cornerY() + 35;
			length += 35;
		}
		super.addTopCard(card);
		card.setCorner(x, ty);
	}

	@Override
	public Card popTop() {
		Card result = super.popTop();
		if (result != null) {
			length -= 35;
		}
		return result;
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

}
