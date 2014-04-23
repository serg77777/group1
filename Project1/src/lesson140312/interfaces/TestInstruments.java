package lesson140312.interfaces;

public class TestInstruments {

	public static void main(String[] args) {
		
		WindInstrument windInstrument = new Trombon();
		MusicInstrument musicInstrument = new Violin();
		
		Violin violin = (Violin) musicInstrument;
		violin.picciato();
		
		Cleannable c = new Violin();
		c.clean();
		
		Violin v = (Violin) c;
		
		takeCare(windInstrument);
		takeCare(musicInstrument);
		
		Cleannable[] objectsToclean = new Cleannable[3];
		objectsToclean[0] = windInstrument;
		objectsToclean[1] = musicInstrument;
		objectsToclean[2] = new Table();
		
		
		cleanAll(objectsToclean);
		
		musicInstrument = new Trombon();
		musicInstrument.play();
		System.out.println(musicInstrument.getClass().getSimpleName());
		
	}

	private static void cleanAll(Cleannable[] cleannables) {
		// TODO Auto-generated method stub
		for (Cleannable cleannable : cleannables) {
			cleannable.clean();
		}
	}

	private static void takeCare(MusicInstrument instrument ) {
		instrument.play();
		instrument.clean();
	}
}
