package lesson140403;

import lesson140331.innerlocal.I;

public class A implements I, X {

	public I getI() {

		return this;
	}

	public void doIt() {

		System.out.println("I did it by myself");
	}
}
