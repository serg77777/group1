package lesson140313.interfaces;

import java.util.ArrayList;

public class TestInterfaces {

		 public static void main(String[] args) {
			 	
			 Trombon trombon = new Trombon();
			 Violin violin = new Violin();
			 
			 Cleanable sth = new Violin();
			 
			 
			 ArrayList<MusicInstrument> list = new ArrayList<MusicInstrument>();
			 ArrayList<Cleanable> cleanables = new ArrayList<>();
			 
			 list.add(violin);
			 list.add(trombon);
		 
			 cleanables.add(violin);
			 cleanables.add(trombon);
			 cleanables.add(sth);
			 cleanables.add(new Table());

			 play(list);
			 clean(cleanables);
		 }

		private static void play(ArrayList<MusicInstrument> instruments) {
			 for (MusicInstrument musicInstrument : instruments) {
				musicInstrument.play();
			}
		}
		
		private static void clean(ArrayList<Cleanable> items) {
			 for (Cleanable dirtyObject : items) {
					dirtyObject.clean();
				}
		}
}
