package homework140305.inheritance.musicalinstruments;

import java.util.Random;

public class OrhestraPerformance {

	public static void main(String[] args) {
		Random rndGen = new Random();
		int instrumentsNumber = rndGen.nextInt(20)+1;
		MusicalInstrument[] orchestra = new MusicalInstrument[instrumentsNumber];
		final int NUMBER_OF_TYPES_OF_INSTRUMENTS = 7;
		int instrumentChooser;
		String owner;
		
		System.out.println("We got " + instrumentsNumber + " in our orhestra\n" );
		
		for (int i = 0; i < orchestra.length; i++) {
			instrumentChooser = rndGen.nextInt(NUMBER_OF_TYPES_OF_INSTRUMENTS);
			switch(instrumentChooser) {
			case 0:
				owner = "Player #" + String.valueOf(i+1) + " - Drummer";
				orchestra[i] = new BassDrum(owner);
				System.out.println("Player #" + String.valueOf(i+1) + " got a Bass Drum");
				break;
			case 1:
				owner = "Player #" + String.valueOf(i+1) + " - Cellist";
				orchestra[i] = new Cello(owner);
				System.out.println("Player #" + String.valueOf(i+1) + " got a Cello");
				break;
			case 2:
				owner = "Player #" + String.valueOf(i+1) + " - Cymbal drummer";
				orchestra[i] = new Cymbal(owner);
				System.out.println("Player #" + String.valueOf(i+1) + " got a Cymbals");
				break;
			case 3:
				owner = "Player #" + String.valueOf(i+1) + " - Piper";
				orchestra[i] = new Didgeridoo(owner);
				System.out.println("Player #" + String.valueOf(i+1) + " got a Didgeridoo");
				break;
			case 4:
				owner = "Player #" + String.valueOf(i+1) + " - Sax guy";
				orchestra[i] = new Sax(owner);
				System.out.println("Player #" + String.valueOf(i+1) + " got a Saxophone");
				break;
			case 5:
				owner = "Player #" + String.valueOf(i+1) + " - Violinist";
				orchestra[i] = new Violin(owner);
				System.out.println("Player #" + String.valueOf(i+1) + " got a Violin");
				break;
			case 6:
				owner = "Player #" + String.valueOf(i+1) + " - Xylophonist";
				orchestra[i] = new Xylophone(owner);
				System.out.println("Player #" + String.valueOf(i+1) + " got a Xylophone");
				break;
			default:
				owner = "Player #" + String.valueOf(i+1) + " - Accordionist";
				orchestra[i] = new MusicalInstrument(owner);
				System.out.println("Player #" + String.valueOf(i+1) + " got generic instrument");
				break;
			}
		}
		System.out.println();
		// LET'S CHECK ALL THE INSTRUMENTS IN ORCHESTRA
		for (int i = 0; i < orchestra.length; i++) {
			System.out.println(orchestra[i].getOwnerName() + " plays "+ orchestra[i].makeSomeSound() );
		}
	}

}
