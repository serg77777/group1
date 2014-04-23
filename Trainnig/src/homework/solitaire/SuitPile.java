package homework.solitaire;

public class SuitPile extends CardPile {

	SuitPile(int xl, int yl) {
		super(xl, yl);
	}

	@Override
	public void select(int tx, int ty) {
		Solitaire.selectionPile.suitPileSelected(this);
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
