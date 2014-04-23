package lesson140312.interfaces;

public class Table extends Furniture {

	@Override
	public void clean() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getName() + " cleaned");
	}
	
}
