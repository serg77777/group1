package lesson140401.localinner;

public class A implements I, X{

	@Override
	public void doIt() {
		System.out.println("did it");
		
	}
	@Override
	public I getI() {
		return this;
	}
	
}
