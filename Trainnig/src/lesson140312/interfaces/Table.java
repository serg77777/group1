package lesson140312.interfaces;

public class Table extends Furnuture {

	@Override
	public void clean() {
		System.out.println(getClass().getSimpleName() + " cleaned");

	}

}
