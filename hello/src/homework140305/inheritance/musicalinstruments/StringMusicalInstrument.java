package homework140305.inheritance.musicalinstruments;

public class StringMusicalInstrument extends MusicalInstrument {

	public StringMusicalInstrument(String ownerName) {
		super(ownerName);
	}

	{
		this.identificator = "String Instrument";
		String[] stringInstrumentProperties = { "Has strings",
				"Played with bare hands (plucking) or bow",
				"Can be carried by 1-2 humans" };
		this.propertiesFields = stringInstrumentProperties;
	}

}
