package lesson140304;

public class D {
	
	public static final int MAX_NUMBER = 10;
	
	public static int count;
	int c;
	
	public static void report(){
		System.out.println("so far we have created " + count + " objects");
	}
	
	{
		count++;
		c++;
		System.out.println("created new instance number " + count + " with c: " + c);
	}
	
	int getC(){
		return c;
	}
}
