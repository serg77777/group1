package lesson140312.intefaces;

public class Trombon extends WindInstrument {

	@Override
	public void play() {
		System.out.println(this.getClass().getSimpleName() + " plays: phuuuu");
	}

	@Override
	public void crush() {

		System.out.println(getClass().getSimpleName() + " crushed");
		
	}

	@Override
	public void clean() {

		System.out.println(getClass().getSimpleName() + " cleaned");
		
	}

}
