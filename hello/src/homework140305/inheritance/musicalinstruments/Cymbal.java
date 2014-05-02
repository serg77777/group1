package homework140305.inheritance.musicalinstruments;

public class Cymbal extends PercussionMusicalInstrument {

	public Cymbal(String ownerName) {
		super(ownerName);
	}
	
	{
		this.identificator = "Cymbal";
		String[] sounds = { "Tsssss"};
		this.availableSounds = sounds;
	}

}
