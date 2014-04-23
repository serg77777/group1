package lesson140312.interfaces;

public class Trombon extends WindInstrument{

	@Override
	public void play() {
		
		System.out.println(this.getClass().getSimpleName() + " plays: phuuuuuu");
		
	}

	@Override
	public void crush() {
	
		System.out.println(this.getClass().getSimpleName() + " is crushed");
		
	}

	@Override
	public void clean() {
		System.out.println(this.getClass().getSimpleName() + " is cleaned");
		
	}
	
}
