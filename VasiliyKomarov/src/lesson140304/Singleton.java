package lesson140304;

public class Singleton {

//	lazy instantiation 
	
	private static Singleton instance = new Singleton();
	
	public static Singleton get() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	static int count = 0;
	
	public static void report() {
		System.out.println("Objects of singleton: " + count);
	}
	
	int state = 0;
	
	{
		count++;
		System.out.println("I am oblect number " + count);
		state = count;
	}
	
	private Singleton() {
	}
	
	public int getState() {
		return state;
	}
	
}
