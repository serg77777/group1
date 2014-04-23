package lesson140313;

import java.util.ArrayList;

public class TestInterfaces {
	public static void main (String [] args){
		String s ="hello";
		
		MusicInstrument trambon = new Trambon();
		Violin violin = new Violin();
		
		MusicInstrument mi = new Violin();
		Object o = new Violin();
		
		
		
		ArrayList<MusicInstrument> list = new ArrayList<MusicInstrument>();
		ArrayList<Cleanable> cleanables = new ArrayList<Cleanable>();
		
		list.add(violin);
		list.add(trambon);
		
		cleanables.add(violin);
		cleanables.add(trambon);
		
		
		
		play(list);
		//clean(cleanables);
		
	}

	private static void use(Violin violin) {
		violin.play();
		violin.clean();
	}

	private static void play(ArrayList<MusicInstrument> instruments) {
		for (MusicInstrument musicInstrument : instruments)
		{
			musicInstrument.play();
			
		}
	}
	
	private static void clean(ArrayList<MusicInstrument> instruments) {
		for (MusicInstrument musicInstrument : instruments)
		{
			musicInstrument.clean();
			
		}
	}
	

}
