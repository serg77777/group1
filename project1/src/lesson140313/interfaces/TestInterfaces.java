package lesson140313.interfaces;

import java.util.ArrayList;

public class TestInterfaces {

	public static void main(String[] args) {

		String s = "hello";

		MusicInstrument trombon = new Trombon();
		Violin violin = new Violin();

		Cleanable smt = new Violin();
		StringInstrument si = new Violin();
		MusicInstrument mi = new Violin();
		Object o = new Violin();

		violin.pic();

		ArrayList<MusicInstrument> list = new ArrayList<MusicInstrument>();
		ArrayList<Cleanable> cleanables = new ArrayList<Cleanable>();

		list.add(violin);
		list.add(trombon);

		cleanables.add(violin);
		cleanables.add(trombon);
		cleanables.add(smt);
		cleanables.add(si);
		cleanables.add(mi);
		cleanables.add(new Table());

		play(list);
		clean(cleanables);

	}

	private static void play(ArrayList<MusicInstrument> instruments) {

		for (MusicInstrument musicInstrument : instruments) {
			musicInstrument.play();
		}

	}

	private static void clean(ArrayList<Cleanable> cleanableObjects) {

		for (Cleanable dirtyObject : cleanableObjects) {
			dirtyObject.clean();
		}

	}
}
