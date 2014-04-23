package lesson140312.interfaces;

public class Violin extends StringInstrument {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName() + " plays sadly");
	}

	@Override
	public void crush() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName() + " crashed");
	}

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName() + " cleaned");
	}

	
	public void picciato() {
		System.out.println("picciato");
	}
	
}
