package lesson140304;

public class Singleton {
	
	
	//lazy instantiation
	
private static Singleton instance;
	
	
	public static Singleton get(){
		if (instance == null){
			instance = new Singleton();
		}
		return instance;
	}	
	
	int state = 0;
	
	static int count = 0;
	
	
	public static void report(){
		System.out.println("Object of singleton: " + count);
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
