package lesson140312.interfaces;

public class Violin extends StringInstrument {

	@Override
	public void play() {
		System.out.println(getClass().getSimpleName() + " plays gentley");

	}

	@Override
	public void crush() {
		System.out.println(getClass().getSimpleName() + " crashed with cry");

	}

	@Override
	public void clean() {
		System.out.println(getClass().getSimpleName() + " cleaned");

	}

	public void pizzicato() {
		System.out.println("tink-tink!");
	}

}
