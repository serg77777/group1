package lesson140320;

public class A {
	
	final static int MAX=20;
	final static int MAX2;
	
	final int state;

	static {
		MAX2 = 10;
	}
	
	{
		//state =10;
	}
	
	A(int initialState){
		state=initialState;
	}
	
}
