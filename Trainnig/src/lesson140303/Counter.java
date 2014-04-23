package lesson140303;

public class Counter {

	private int count = 0;

	public void increase() {

		count++;
		System.out.println("Counter state changed");
	}

	public int get() {

		System.out.println("Counter state requested");
		return count;
	}
}
