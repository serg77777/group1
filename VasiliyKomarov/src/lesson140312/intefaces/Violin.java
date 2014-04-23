package lesson140312.intefaces;

public class Violin extends StringInstrument {

	@Override
	public void play() {
		System.out.println(getClass().getName() + " lays sadly");
		
	}

	@Override
	public void crush() {

		System.out.println(getClass().getName() + " violin crushed");
		
	}

	@Override
	public void clean() {

		System.out.println(getClass().getName() + " violin cleaned");
		
	}
	
	public void piccicato() {
		System.out.println("piccicato");
	}

}
