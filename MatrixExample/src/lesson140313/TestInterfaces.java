package lesson140313;

import java.util.ArrayList;

public class TestInterfaces {

	public static void main(String[] args) {
		String s = "hello";
		
		Trombon trombon = new Trombon();
		Violin violin = new Violin();
		StringInstrument si = new Violin();
		MusicInstrument mi = new Violin();
		Object o = new Violin();
		Cleanable cleanable = new Violin();
		
		
		ArrayList<MusicInstrument> list = new ArrayList<MusicInstrument>();
		ArrayList<Cleanable> cleanables = new ArrayList<Cleanable>();
		
		
		list.add(trombon);
		list.add(violin);
		
		cleanables.add(violin);
		cleanables.add(trombon);
		cleanables.add(cleanable);
		cleanables.add(violin);
		cleanables.add(violin);
		
		
		play(list);
		clean(cleanables);
		
	}

	public static void play(ArrayList<MusicInstrument> instrument) {
		for (MusicInstrument musicInstrument : instrument) {
			musicInstrument.play();
		}
	}
	public static void clean(ArrayList<Cleanable> cleanableObject) {
		for (Cleanable dirtyOject : cleanableObject) {
			dirtyOject.clean();
		}
	}
}
