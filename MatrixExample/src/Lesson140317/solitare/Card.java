package Lesson140317.solitare;

import java.awt.Color;
import java.awt.Graphics;

public class Card {

	// data fields for colors and suits
	final static int width = 62;
	final static int height = 90;
	final static int red = 0;
	final static int black = 1;
	final static int heart = 0;
	final static int spade = 1;
	final static int diamond = 2;
	final static int club = 3;
	int x, y;
	
	private String name;

	// private static String names[] = {"A", "2", "3", "4", "5", "6",
	// "7", "8", "9", "10", "J", "Q", "K"};

	public String getName() {
		String result = null;
		switch (rank()) {
		case 0:
			result = "A";
			break;
		case 1:
			result = "2";
			break;
		case 2:
			result = "3";
			break;
		case 3:
			result = "4";
			break;
		case 4:
			result = "5";
			break;
		case 5:
			result = "6";
			break;
		case 6:
			result = "7";
			break;
		case 7:
			result = "8";
			break;
		case 8:
			result = "9";
			break;
		case 9:
			result = "10";
			break;
		case 10:
			result = "J";
			break;
		case 11:
			result = "Q";
			break;
		case 12:
			result = "K";
			break;

		default:
			break;
		}

		
		return name;
	}

	// data fields
	private boolean faceup;
	private int rank;
	private int suit;
	public Card link;

	// constructor
	Card(int sv, int rv) {
		suit = sv;
		rank = rv;
		faceup = false;

	}

	// access attributes of card
	public int rank() {
		return rank;
	}

	public int suit() {
		return suit;
	}

	public boolean faceUp() {
		return faceup;
	}

	public void flip() {
		faceup = !faceup;
	}

	public int color() {
		if (suit() == heart || suit() == diamond)
			return red;
		return black;
	}

	public void draw(Graphics g, int x, int y) {

		String names[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K" };
		// clear rectangle, draw border
		g.clearRect(x, y, width, height);
		g.setColor(Color.black);
		// g.drawRect(x, y, width, height);

		// draw body of card
		if (faceUp()) {
			switch (names[rank()]) {
			case "A":
				drawCard(g, x, y, 0);
				break;
			case "2":
				drawCard(g, x, y, 1);
				break;
			case "3":
				drawCard(g, x, y, 2);
				break;
			case "4":
				drawCard(g, x, y, 3);
				break;
			case "5":
				drawCard(g, x, y, 4);
				break;
			case "6":
				drawCard(g, x, y, 5);
				break;
			case "7":
				drawCard(g, x, y, 6);
				break;
			case "8":
				drawCard(g, x, y, 7);
				break;
			case "9":
				drawCard(g, x, y, 8);
				break;
			case "10":
				drawCard(g, x, y, 9);
				break;
			case "J":
				drawCard(g, x, y, 10);
				break;
			case "Q":
				drawCard(g, x, y, 11);
				break;
			case "K":
				drawCard(g, x, y, 12);
				break;

			default:

				break;
			}
		} else { // face down
			g.drawImage(Solitaire.img, x, y, x + width, y + height, 0,
					206 * 4 + 33, 146, 206 * 5 + 33, null);
		}

	}
	
	
	private void drawCard(Graphics g, int x, int y, int count) {
		final int imgHeight = 206;
		final int imgWidht = 146;
		final int empty = 9;
		
		switch (suit()) {
		case heart:
			g.drawImage(Solitaire.img, x, y, x + width, y + height, imgWidht
					* count + empty * count, 0, imgWidht * (count + 1) + empty
					* (count), imgHeight, null);
			break;
		case spade:
			g.drawImage(Solitaire.img, x, y, x + width, y + height, imgWidht
					* count + empty * count, imgHeight + empty, imgWidht
					* (count + 1) + empty * (count), imgHeight * 2 + empty,
					null);
			break;
		case diamond:
			g.drawImage(Solitaire.img, x, y, x + width, y + height, imgWidht
					* count + empty * count, imgHeight * 2 + empty * 2,
					imgWidht * (count + 1) + empty * (count), imgHeight * 3
							+ empty * 2, null);
			break;
		case club:
			g.drawImage(Solitaire.img, x, y, x + width, y + height, imgWidht
					* count + empty * count, imgHeight * 3 + empty * 3,
					imgWidht * (count + 1) + empty * (count), imgHeight * 4
							+ empty * 3, null);
			break;
		}
	}
}