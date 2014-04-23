package lesson140304;

public class Singleton {

	private static Singleton instance;
	
	
	public static Singleton get(){
		if (instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	static int count = 0;
	int state = 0;
	
	public static void report(){
		System.out.println("objects of singleton " + count);
	}
	
	{
		count++;
		System.out.println("I am object number " + count);
		state = count;
	
	}
	private Singleton(){
		
	}
	
	public int getState(){
		return state;
	}
}
