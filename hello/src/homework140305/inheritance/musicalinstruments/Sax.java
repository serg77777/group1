package homework140305.inheritance.musicalinstruments;

public class Sax extends WindMusicalInstrument {

	public Sax(String ownerName) {
		super(ownerName);
	}
	
	{
		this.identificator = "Saxophone";
		String[] sounds = { "Masterly improvised sound", "Averagely improvised sound",
				"Deep sax sound" };
		this.availableSounds = sounds;
	}

}
