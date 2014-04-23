package Lesson140304.internal;

public class Singleton {
	// Lazy instantiation
	
	
	private static Singleton instance = new Singleton();
	private static int count = 0;
	
	public static Singleton get() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public static void report() {
		System.out.println("Oject of singleton " + count);
	}
	
	int state = 0;

	{
		count++;
		System.out.println("I am object number " + count);
		state = count;

	}
	private Singleton() {
	}
	
	public int getState() {
		return state;
	}
}
