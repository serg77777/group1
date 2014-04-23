package lesson140313.interfaces;

public class TestTypes2 {
	public static void main(String[] args) {
		Violin violin = new Violin();
		Trombon trombon = new Trombon();
		
		MusicInstrument mi = violin;
		
		Object object = new Trombon();
		
		((Cleanable) object).clean();
		
	}
}
