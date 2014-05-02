package homework140305.inheritance.musicalinstruments;

public class Xylophone extends PercussionMusicalInstrument {

	public Xylophone(String ownerName) {
		super(ownerName);
	}
	
	{
		this.identificator = "Xylophone";
		String[] sounds = { "Tin", "Tun",
				"Pum" };
		this.availableSounds = sounds;
	}

}
