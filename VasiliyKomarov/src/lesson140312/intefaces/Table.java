package lesson140312.intefaces;

public class Table extends Furniture {

	@Override
	public void clean() {
		System.out.println(getClass().getName() + " cleaned big table");
	}

	
	
}
