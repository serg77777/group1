package lesson140305.inheritance2;

import lesson140305.inheritance.C;

public class D extends C {

	C c = new C();
	
	public void doIt() {
		changeState();
	}
	
	public int getState() {
		return _state;
	}
	
}
