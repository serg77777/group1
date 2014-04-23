package lesson140227;

public class A {
	//members  
	
	// field
	int state;
	public A(){ // constructor
		System.out.println("create " +this);
	}

	A(int initialState) {
		this();// A();
		state = initialState;
	}
	
	void changeState() {
		state++;
	}
	

	


}
