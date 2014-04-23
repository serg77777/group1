package lesson140313.interfaces;

import java.util.ArrayList;


public class TestInterfaces {
	public static void main(String[] args){
		String s = "hello";
		
		MusicInstrument trombon= new Trombon();
		MusicInstrument violin = new Violin();
		
		Furniture table = new Furniture();
		
		ArrayList<Cleanable> list = new ArrayList<Cleanable>();
		
		list.add(trombon);
		list.add(violin);
		list.add(table);
		
		list.add(new Table());
		clean(list);
		
	}

	private static void play(ArrayList<MusicInstrument> instruments) {
		for (MusicInstrument instrument : instruments) {
			instrument.play();
		}
	
	}
	private static void clean(ArrayList<Cleanable> cleanableObjects) {
		for (Cleanable dirtyObject : cleanableObjects) {
			dirtyObject.clean();
		}	
	}
}
