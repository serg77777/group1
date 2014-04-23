package lesson140303;

public class Counter {

	public int count = 0;
	
	public void inc() {
		count++;
		System.out.println("changed state of counter");
	}
	
	public int get() {
		System.out.println("requested state of counter");
		return count;
	}
	
}
