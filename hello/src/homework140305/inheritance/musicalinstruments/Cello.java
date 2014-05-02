package homework140305.inheritance.musicalinstruments;

public class Cello extends StringMusicalInstrument {

	public Cello(String ownerName) {
		super(ownerName);
	}

	{
		this.identificator = "Cello";
		String[] sounds = { "High cello sound", "Bass cello sound",
				"Bariton-like cello sound" };
		this.availableSounds = sounds;
	}
}
