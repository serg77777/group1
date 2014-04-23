package lesson140305.Inh2;

import lesson140305.C;

public class D extends C {

	C c = new C();

	public void doIt() {

		changeState();

	}

	public int getState() {

		return state;
	}

}
