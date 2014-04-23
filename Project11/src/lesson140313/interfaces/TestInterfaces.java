package lesson140313.interfaces;

import java.util.ArrayList;

public class TestInterfaces {
	
	public static void main(String[] args) {
		
//		String s = "hello";
		
		MusicInstrument trombon = new Trombon();
//		Violin violin = new Violin();
		
		StringInstruments si = new Violin();
		Violin violin = new Violin();
		MusicInstrument mi = new Violin();
		Object o = new Violin();
		Cleanable cleanable = new Violin();
		
		violin.piccicato();
	//		si.piccicato();
		
		ArrayList<MusicInstrument> list = new ArrayList<MusicInstrument>();
		ArrayList<Cleanable> cleanables = new ArrayList<Cleanable>();
		
		list.add(violin);
		list.add(trombon);
		cleanables.add(trombon);
		cleanables.add(violin);
		cleanables.add(si);
		cleanables.add(mi);
//		cleanables.add(o);
		
		play(list);
		clean(cleanables);
		
		
	}

	private static void play(ArrayList<MusicInstrument> instruments) {
		for (MusicInstrument musicInstrument : instruments) {
			musicInstrument.play();
		}

	}
	
	private static void clean(ArrayList<Cleanable> cleanableObjects) {
		for (Cleanable dirtyObjects : cleanableObjects) {
			dirtyObjects.clean();
		}
		
	}

}
