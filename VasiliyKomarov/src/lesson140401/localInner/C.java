package lesson140401.localInner;


public class C implements X {

	public I getI() {
		return new StaticInner();
	}
	
}
