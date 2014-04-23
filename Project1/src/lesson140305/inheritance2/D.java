package lesson140305.inheritance2;

import lesson140305.inheritance.C;

public class D extends C{

//	C c = new C();
	
	
	public void doIt(){
		
		changeState();
	}
	
	public int getState(){
		return state;
	}
	
	@Override
	public void changeState() {
			System.out.println("State before = "+ state);
			super.changeState();
			System.out.println("State after = "+ state);
	}
}
