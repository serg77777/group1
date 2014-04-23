package lesson140226;

public class A {
	
	int state;
	
	A() {
		this(10);
	}
	
	public A(int initialState) {
		System.out.println("new instance of A created");
		state = initialState;
	
	}
	
	
	void changeState() {
		state++;
	}
	
	
}
