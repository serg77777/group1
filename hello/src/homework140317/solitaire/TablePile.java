package homework140317.solitaire;

import java.awt.*;

class TablePile extends CardPile {
	
	
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
		if (empty() || !top().faceUp())
			return aCard.rank() == 12;
		Card topCard = top();
		return (aCard.color() != topCard.color())
				&& (aCard.rank() == topCard.rank() - 1);
	}

	public boolean includes(int tx, int ty) {
		boolean yFlag = ( (ty >= y + (pileCardCount()-pileFaceUppedCardCount())*(Card.height/2) ) && (ty <= y + (pileCardCount()+1)*(Card.height/2)) );
		return ((x <= tx && tx <= x + Card.width) && yFlag);
	}

	public void performAction(int tx, int ty) {
		if (!Solitaire.isAnyCardSelected) {
			
			if (empty()) 
				return;
			
			Card topCard = top();
			if (!topCard.faceUp()) {
				topCard.flip();
				return;
			}
			
			//We can select some card in this pile - doing so.
			
			pileHasSelectedCard = true;
			
			Card sCard;
			CardPile selectedCards = new CardPile(0, 0);
			
			if ( ty - (y + pileCardCount()*(Card.height/2)) > 0 ) {
				 sCard = pop();
				 selectedCards.addCard(sCard);
				 sCard.toggleSelection();
				 addCard(sCard);
 			} else {
 				for (int i = pileCardCount()-1; i>((ty-y)/(Card.height/2)); i--) {
 					selectedCards.addCard(pop());
 					Solitaire.isMultipleCardSelected = true;
 				}
 				sCard = pop();
 				sCard.toggleSelection();
 				
 				addCard(sCard);
 				while(!selectedCards.empty()){
 					addCard(selectedCards.pop());
 				}
 			}

			
		} else if(!pileHasSelectedCard()) {
			//can this pile accept selected card(s)?
			if(canTake(Solitaire.selectedCard)) {
				for (int i = 0; i < 13; i++) {
					if(Solitaire.allPiles[i].pileHasSelectedCard()) {
						Solitaire.allPiles[i].deselectPile();
						Solitaire.isMultipleCardSelected = false;
						CardPile movedPile = new CardPile(0,0);
						while (!Solitaire.allPiles[i].top().isSelected()) {
							movedPile.addCard(Solitaire.allPiles[i].pop());
						}
						Card mCard = Solitaire.allPiles[i].pop();
						mCard.toggleSelection();
						movedPile.addCard(mCard);
						while(!movedPile.empty()) {
							addCard(movedPile.pop());
						}
							
					}
				}
			}
		
		} else {
			// Pile has selected card - de-selecting
			Card sCard;
			CardPile selectedCards = new CardPile(0, 0);
			while(!empty()) {
				sCard = pop();
				if (sCard.isSelected()) {
					sCard.toggleSelection();
					selectedCards.addCard(sCard);
					break;
				}
				selectedCards.addCard(sCard);
			}
			while(!selectedCards.empty()) {
				addCard(selectedCards.pop());
			}
			deselectPile();
			Solitaire.isMultipleCardSelected = false;
		}
	}
	//============================================================
	private int stackDisplay(Graphics g, Card aCard, Image cardBack) {
		int localy;
		if (aCard == null)
			return y;
		localy = stackDisplay(g, aCard.link, cardBack);
		aCard.draw(g, x, localy, cardBack);
		return localy + Card.height/2;
	}
	
	public void display(Graphics g, Image cardBack) {
		stackDisplay(g, top(), cardBack);
	}
	
	//============================================================
	
	
	private int pileCardCount = 0;
	private int pileFaceUppedCardCount = 0;
	
	private void CardCounter() {
		int count = 0;
		int faceUpCount = 0;
		CardPile counterPile = new CardPile(0, 0);
		while(!empty()) {
			Card countedCard = pop();
			count++;
			if (countedCard.faceUp()) {
				faceUpCount++;
			}
			counterPile.addCard(countedCard);
		}
		while(!counterPile.empty()){
			addCard(counterPile.pop());
		}
		pileCardCount = count;
		pileFaceUppedCardCount = faceUpCount;
	}
	
	public int pileCardCount() {
		CardCounter();
		return pileCardCount;
	}
	
	public int pileFaceUppedCardCount() {
		CardCounter();
		return pileFaceUppedCardCount;
	}
	
	@Override
	public boolean pileHasSelectedCard() {
		return pileHasSelectedCard;
	}

}