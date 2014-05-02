package homework140305.inheritance.musicalinstruments;

public class PercussionMusicalInstrument extends MusicalInstrument {

	public PercussionMusicalInstrument(String ownerName) {
		super(ownerName);
	}

	{
		this.identificator = "Percussion Instrument";
		String[] percussionInstrumentProperties = { "Pitched or Unpitched",
				"Played by strucking resonator element" };
		this.propertiesFields = percussionInstrumentProperties;
	}

}
