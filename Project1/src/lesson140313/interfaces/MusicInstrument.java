package lesson140313.interfaces;

abstract public class MusicInstrument implements Cleanable {

	abstract public void play(); 
	abstract public void destroy();
	
	@Override
	public void clean() {
		System.out.println("cleaning " + getClass().getSimpleName());
	
	} 
}
