package lesson140312.interfaces;

public class Bugle extends WindInstrument{

	@Override
	public void play() {
		System.out.println(this.getClass().getSimpleName()+" plays du-du-duuuu");
	}

	@Override
	public void crush() {
		System.out.println(this.getClass().getSimpleName()+" crushed du-du-duuuu");
		
	}

	@Override
	public void clean() {
		System.out.println(this.getClass().getSimpleName()+" cleaned du-du-duuuu");
		// TODO Auto-generated method stub
		
	}

}
