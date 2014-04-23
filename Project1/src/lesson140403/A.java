package lesson140403;

public class A implements I, X {
	
	public I getI() {
		return this;
	}
	
	public void doIt() {
		System.out.println("I did it by myself");
	}
	
}
