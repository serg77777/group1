package homework140317.solitaire;

class SuitPile extends CardPile {

	SuitPile(int x, int y) {
		super(x, y);
	}

	public boolean canTake(Card aCard) {
		if (empty())
			return aCard.rank() == 0;
		Card topCard = top();
		return (aCard.suit() == topCard.suit())
				&& (aCard.rank() == 1 + topCard.rank());
	}
	
	@Override
	public void performAction(int tx, int ty) {
		if (Solitaire.isAnyCardSelected && !Solitaire.isMultipleCardSelected) {
			if(canTake(Solitaire.selectedCard)) {
				for (int i = 0; i < 13; i++) {
					if(Solitaire.allPiles[i].pileHasSelectedCard()) {
						Solitaire.allPiles[i].deselectPile();
						Card mCard = Solitaire.allPiles[i].pop();
						mCard.toggleSelection();
						addCard(mCard);

							
					}
				}
			}
		}
	}
}