package homework.solitaire;

public interface Deck {
	void select(int tx, int ty);

	void addTopCard(Card card);

	void addBottomCard(Card card);

	boolean includes(int tx, int ty);

	boolean canTake(Card card);

	boolean empty();

	Card top();

	Card bottom();

	Card popTop();

	Card popBottom();

}
