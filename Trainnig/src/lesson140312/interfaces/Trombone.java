package lesson140312.interfaces;

public class Trombone extends WindInstrument {

	@Override
	public void play() {
		System.out.println(this.getClass().getSimpleName() + " plays: phuuuu");

	}

	@Override
	public void crush() {
		System.out.println(this.getClass().getSimpleName() + " crushed");

	}

	@Override
	public void clean() {
		System.out.println(this.getClass().getSimpleName() + " cleaned");

	}

}
