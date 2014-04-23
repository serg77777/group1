package lesson140312.interfaces;

public class TestInstruments {
	public static void main(String[] args) {
		WindInstrument wi = new Bugle();
		MusicInstrument mi = new Violin();
Violin vi=(Violin)mi;
vi.pizzahut();
		takeCare(wi);
		takeCare(mi);
		System.out.println();
		Cleanable[] propro = new Cleanable[3];
		propro[0] = wi;
		propro[1] = mi;
		propro[2] = new Table();
		
		cleanAll(propro);
		
		propro[1] = wi;
		System.out.println();
		cleanAll(propro);
	}

	private static void cleanAll(Cleanable[] cleanables) {
		// TODO Auto-generated method stub
		for (Cleanable cleanable : cleanables) {
			cleanable.clean();
		}
	}

	private static void takeCare(MusicInstrument instrument) {
		instrument.play();
		instrument.clean();

	}
}