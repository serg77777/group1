package lesson140304.internal;

public class Singleton {
	
	public static Singleton instance = new Singleton();
	
//	lazy instantiation
	public static Singleton get(){
		
		if (instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	
	static int count = 0;
	
	public static void report(){
		System.out.println("Object of Singleton is " + count);
	}
	
	int state = 0;
	
	{
		count++;
		System.out.println("I am obect number " + count);
		state = count;
	}
	
	private Singleton() {
		
	}
	
	public int getState() {
		return state;
	}
}
