package lesson140226;

public class A {
	
	int state;
	
	 A() {
		this(10);
	}
	
	A(int initialState) {
		System.out.println("New instance of A created");
		state = initialState;
		//
		//
	}
	
	void changeState() {
		state++;
	}
	
}
