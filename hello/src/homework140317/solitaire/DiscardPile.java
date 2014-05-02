package homework140317.solitaire;

class DiscardPile extends CardPile {

	DiscardPile(int x, int y) {
		super(x, y);
	}

	public void addCard(Card aCard) {
		if (!aCard.faceUp())
			aCard.flip();
		super.addCard(aCard);
	}

	public void performAction(int tx, int ty) {
		if (!Solitaire.isAnyCardSelected) {
			if (empty())
				return;
			Card topCard = pop();
			topCard.toggleSelection();
			pileHasSelectedCard = true;
			addCard(topCard);
		
		} else if (!empty() && pileHasSelectedCard()) {
			deselectPile();
			Card topCard = pop();
			topCard.toggleSelection();
			addCard(topCard);
		}
	}
	
	public boolean pileHasSelectedCard() {
		return pileHasSelectedCard;
	}
}
