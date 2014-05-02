package homework140305.inheritance.musicalinstruments;

public class WindMusicalInstrument extends MusicalInstrument {

	public WindMusicalInstrument(String ownerName) {
		super(ownerName);
	}

	{
		this.identificator = "Wind Instrument";
		String[] windInstrumentProperties = { "Has nozzle",
				"Played by mechanically or human produced air streams",
				"Can be carried by 1-2 humans" };
		this.propertiesFields = windInstrumentProperties;
	}

}
