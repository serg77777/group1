package lesson140227;

public class A {

	int state; // 
	
	public A(){
		System.out.println("created " + this);
	}
	
	A(int initialState){
		this();
		state= initialState;
	}
	void changeState(){
		state++;
	}
}
