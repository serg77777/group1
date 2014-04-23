package lesson140312.interfaces;

public class Violin extends StringInstruments {

	@Override
	public void play() {
		System.out.println(getClass().getSimpleName()+ " wefe");
	}

	@Override
	public void crush() {
		System.out.println(getClass().getSimpleName() +" sdfdf");
		
	}

	@Override
	public void clean() {
		System.out.println(getClass().getSimpleName()+ " cleaned");

	}
	
	public void pizzahut(){
		System.out.println("Pizza!!");
	}

}
