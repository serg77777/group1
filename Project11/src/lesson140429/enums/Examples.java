package lesson140429.enums;

public class Examples {

	enum Apple {
		Jonathan, GoldenDel, RedDel, Winesap, Cortland
	}
	
	enum РусскиеЯблоки {
		Семеренко(10), Антоновка(15), СлаваПобедителю(20);
		
		public int цена;
		
		РусскиеЯблоки (int цена){
			this.цена = цена;
		}
		public int стоимость() {
			return цена;
		}
	}
	
	public final static int MAX_VALUE = 100;
	
	public static void main(String[] args) {
		
		Apple ap = Apple.Jonathan;
		
		System.out.println(ap.name());
		System.out.println(Apple.RedDel.ordinal());
		
		switch (ap) {
		
		case Jonathan:
			//
			break;
		case RedDel:
			//
			break;
		case Winesap:
			//
			break;
		case Cortland:
			//
			break;
		
		}
		
		for (Apple apple : Apple.values()) {
			System.out.println(apple.name() + " " + apple.ordinal());
		}
		
		for (РусскиеЯблоки сортЯблок : РусскиеЯблоки.values()) {
			System.out.println(сортЯблок.name() + " " + сортЯблок.стоимость());
		}
	}
}
