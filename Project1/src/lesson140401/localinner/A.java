package lesson140401.localinner;

public class A implements I, ImplementorOfI{

	public I getImplementationOfI () {
		
		return this;
	}
	
	public void doIt() {
		System.out.println("A did it by myself");
	}
}
