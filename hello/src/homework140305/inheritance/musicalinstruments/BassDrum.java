package homework140305.inheritance.musicalinstruments;

public class BassDrum extends PercussionMusicalInstrument {

	public BassDrum(String ownerName) {
		super(ownerName);
	}
	{
		this.identificator = "BassDrum";
		String[] sounds = { "Bum", "Dum",
				"Boom" };
		this.availableSounds = sounds;
	}

}
