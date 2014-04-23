package lesson140313.interfaces;

public class TestTypes2 {

	public static void main(String[] args) {
		Violin violin = new Violin();
		
		System.out.println(violin);
		
		Object object = new Trombon();
		
		Trombon trombon = new Trombon();
		
		MusicInstrument mi = violin;
		
		
		
		mi.play();
		mi.clean();
//		mi.piccicato();
		
		((Cleanable)object).clean();
		((Violin)mi).piccicato();
	}
}
