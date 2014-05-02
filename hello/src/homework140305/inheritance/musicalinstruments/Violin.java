package homework140305.inheritance.musicalinstruments;

public class Violin extends StringMusicalInstrument {

	public Violin(String ownerName) {
		super(ownerName);
	}
	
	{
		this.identificator = "Violin";
		String[] sounds = { "Soft violin sound", "Bright violin sound",
				"Deep violin sound" };
		this.availableSounds = sounds;
	}

}
