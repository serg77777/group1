package lesson140401.localInner;

public class B implements X {
	
	public I getI() {
		return new OuterI();
	}
	
}
