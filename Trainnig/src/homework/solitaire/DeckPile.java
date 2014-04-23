package homework.solitaire;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckPile extends CardPile {
	DeckPile(int x, int y) {
		// first initialize parent
		super(x, y);
		// then create the mock deck
		List<int[]> rawDeck = new ArrayList<int[]>();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				int[] rawCard = { i, j };
				rawDeck.add(rawCard);
			}
		}
		// shuffle mock deck
		Collections.shuffle(rawDeck);
		// and form true deck
		for (int[] rawCard : rawDeck) {
			addTopCard(new Card(rawCard[0], rawCard[1]));
		}
	}

	@Override
	public void select(int tx, int ty) {
		Solitaire.selectionPile.flush();
		if (empty()) {
			while (!Solitaire.discardPile.empty()) {
				addTopCard(Solitaire.discardPile.popTop());
				top().flip();
			}
			return;
		}
		Solitaire.discardPile.addTopCard(popTop());
	}
}
