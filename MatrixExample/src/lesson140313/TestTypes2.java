package lesson140313;

public class TestTypes2 {
	public static void main(String[] args) {
		
		Violin violin = new Violin();
		Trombon trombon = new Trombon();
		
		Object object = new Trombon();
		
		MusicInstrument mi = violin;
		
		
		mi.play();
		mi.clean();
//		mi.piccicat(); ERROR
		
		
		// Низковосходящее приобразование  и высоковосходящее
		((Cleanable)object).clean();
//		((Violin)object).piccicat(); RUNTIME ERROR!
		
		((Violin)mi).piccicat();
		
	}
}
