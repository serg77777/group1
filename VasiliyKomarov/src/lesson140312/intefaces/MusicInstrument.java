package lesson140312.intefaces;

public abstract class MusicInstrument implements Cleanable {

	abstract public void play();
	abstract public void crush();
	
	@Override
	public void clean() {
		System.out.println("clean " + getClass().getSimpleName());
	}
	
}
