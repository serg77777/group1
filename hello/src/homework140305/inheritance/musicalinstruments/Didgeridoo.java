package homework140305.inheritance.musicalinstruments;

public class Didgeridoo extends WindMusicalInstrument {

	public Didgeridoo(String ownerName) {
		super(ownerName);
	}
	
	{
		this.identificator = "Didgeridoo";
		String[] sounds = { "Ahuuuum", "Vu'uuuum",
				"Vzhhhhh" };
		this.availableSounds = sounds;
	}

}
