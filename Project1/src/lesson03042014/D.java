package lesson03042014;

public class D {
	public static final int MAX_NUMBER=10;
	static int count;
	public static void report(){
		System.out.println("created "+count+" objects");
	}
	int c;
	{
		count++;
		c++;
		System.out.println("created new instance number "+count+ " with c=" +c);
	}
	int getC(){
		return c;
	}
}
