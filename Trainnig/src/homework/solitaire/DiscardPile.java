package homework.solitaire;

public class DiscardPile extends CardPile {

	DiscardPile(int x, int y) {
		super(x, y);
	}

	@Override
	public void addTopCard(Card card) {
		if (!card.faceUp()) {
			card.flip();
		}
		super.addTopCard(card);
	}

	@Override
	public void select(int tx, int ty) {
		if (empty()) {
			return;
		}
		Solitaire.selectionPile.fill(this, top());
	}

	@Override
	public boolean canTake(Card aCard) {
		return true;
	}

}
