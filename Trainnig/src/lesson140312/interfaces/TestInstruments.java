package lesson140312.interfaces;

public class TestInstruments {
	public static void main(String[] args) {
		WindInstrument windInstrument = new Trombone();
		MusicalInstrument musicalInstrument = new Violin();

		// Violin violin = new Trombone(); ERROR: type mismatch

		Violin violin = (Violin) musicalInstrument;
		violin.pizzicato();
		Cleanable c = new Violin();

		Violin v = (Violin) c;
		v.play();

		// Trombone t = (Trombone) c;

		// musicalInstrument.pizzicato();

		takeCare(windInstrument);
		takeCare(musicalInstrument);

		Cleanable[] objectsToClean = new Cleanable[3];
		objectsToClean[0] = windInstrument;
		objectsToClean[1] = musicalInstrument;
		objectsToClean[2] = new Table();

		cleanAll(objectsToClean);

		musicalInstrument = new Trombone();
		musicalInstrument.play();
		System.out.println(musicalInstrument.getClass().getSimpleName());
	}

	private static void cleanAll(Cleanable[] cleanables) {
		for (Cleanable cleanable : cleanables) {
			cleanable.clean();
		}

	}

	private static void takeCare(MusicalInstrument instrument) {
		instrument.play();
		instrument.clean();

	}

}
