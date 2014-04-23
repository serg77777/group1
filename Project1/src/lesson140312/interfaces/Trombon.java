package lesson140312.interfaces;

public class Trombon extends WindInstrument {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName() + " plays: phuu");
	}

	@Override
	public void crush() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName() + " crashed");
	}

@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName() + " cleaned");
	}

}
