package lesson140313.interfaces;

public class TestTypes2 {

	public static void main(String[] args) {
		
		Violin violin = new Violin();
		
		System.out.println(violin);
		Trombon trombon = new Trombon();
		
		Object object = new Trombon();
		
		MusicInstrument mi = violin;
		
		mi.play();
		mi.clean();
		violin.piccicato();
		
		((Cleanable)object).clean();
		((Trombon)object).clean();
//		((Violin)object).piccicato(); //пытались тромбон превратить в скрипку
		((Violin)mi).piccicato();
		
		
	}
	
}
