package lesson140304;

public class D {

	public static final int MAX_NUMBER = 10;
	public static int count;
	
	public static void report(){
		
		System.out.println("so far we have created " + count + " objects");
		
	}
	
	int c;
	
	{
		c++;
		count++;
		System.out.println("created new instance number " + count 
				+ " with c = " + c);
	}
	
	int getC(){
		
		return c;
		
	}
	
}
