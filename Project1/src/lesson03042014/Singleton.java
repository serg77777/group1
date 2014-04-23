package lesson03042014;

public class Singleton {
	
	private static Singleton instance = new Singleton();
	
	public static Singleton get(){
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	static int count = 0;
	
	public static void report(){
		System.out.println("Objects of singleton "+count);
	}
	int state = 0;
	{
		count++;
		System.out.println("I am object number "+ count );
		state = count;
		
	}
	Singleton() {
	}
	
	public int getState(){
		return state;
	}
}
