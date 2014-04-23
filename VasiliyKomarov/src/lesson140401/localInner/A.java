package lesson140401.localInner;

public class A implements I, X{

	public I getI() {
		return this;
	}

	@Override
	public void doIt() {
		System.out.println("I did it by myself");
	}
	
}
