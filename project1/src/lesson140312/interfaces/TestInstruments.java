package lesson140312.interfaces;

public class TestInstruments {

	public static void main(String[] args) {

		Trombon trombon = new Trombon();
		Violin violin = new Violin();
		takeCare(trombon);
		takeCare(violin);

	}

	private static void takeCare(MusicInstrument instrument) {

		instrument.play();
		instrument.clean();
	}
}
