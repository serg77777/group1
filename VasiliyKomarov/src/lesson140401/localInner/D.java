package lesson140401.localInner;

public class D implements X {
	
	int state = 100;
	
	public class Inner implements I {

		@Override
		public void doIt() {
			System.out.println("I did it from inside" + state); // local class
		}

	}
	
	public I getI() {
		return new Inner();
	}
	
}
