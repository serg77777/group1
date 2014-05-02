package homework140317.solitaire;

class DeckPile extends CardPile {

	DeckPile(int x, int y) {
		// first initialize parent
		super(x, y);
		// then create the new deck
		// first put them into a local pile
		CardPile pileOne = new CardPile(0, 0);
		CardPile pileTwo = new CardPile(0, 0);
		int count = 0;
		for (int i = 0; i < 4; i++)
			for (int j = 0; j <= 12; j++) {
				pileOne.addCard(new Card(i, j));
				count++;
			}
		// then pull them out randomly
		for (; count > 0; count--) {
			int limit = ((int) (Math.random() * 1000)) % count;
			// move down to a random location
			for (int i = 0; i < limit; i++)
				pileTwo.addCard(pileOne.pop());
			// then add the card found there
			addCard(pileOne.pop());
			// then put the decks back together
			while (!pileTwo.empty())
				pileOne.addCard(pileTwo.pop());
		}
	}

	public void performAction(int tx, int ty) {
		if (!Solitaire.isAnyCardSelected) {
			if (!empty()) {
				Solitaire.discardPile.addCard(pop());
			} else {
				Card tempCard;
				while (!Solitaire.discardPile.empty()) {
					tempCard = Solitaire.discardPile.pop();
					tempCard.flip();
					this.addCard(tempCard);
				}
			}
		}
	}
}