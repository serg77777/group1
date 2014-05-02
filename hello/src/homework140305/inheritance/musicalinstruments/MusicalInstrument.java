package homework140305.inheritance.musicalinstruments;

import java.util.Random;

public class MusicalInstrument {
	protected String ownerName = "Public property";
	protected String identificator = "Generic Musical Instrument";
	protected String[] propertiesFields = { "Generic Properties" };
	protected String[] availableSounds = { "Undefined Sound" };

	public MusicalInstrument(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	// public void setOwnerName(String ownerName) {
	// this.ownerName = ownerName;
	// }

	public String getIdentificator() {
		return identificator;
	}

	public String makeSomeSound() {
		Random soundChooser = new Random();
		String chosenSound = availableSounds[soundChooser
				.nextInt(availableSounds.length)];
		return chosenSound;
	}

	public void listProperties() {
		System.out.print(getIdentificator() + " has following properties: ");
		for (int i = 0; i < propertiesFields.length; i++) {
			System.out.print(propertiesFields[i] + "; ");

		}
		System.out.print("\n");
	}

}
