package lesson140428.enums;

public class Example2 {

	enum Fruit {
		Apple(10), Pear(15), Carrot(100);

		private int _price;

		Fruit(int price) {

			_price = price;
		}

		int getPrice() {

			return _price;
		}
	}

	public static void main(String[] args) {

		for (Fruit fruit : Fruit.values()) {
			System.out.println(fruit + "\t" + fruit.getPrice() + "\t"
					+ fruit.ordinal());
		}
	}
}
