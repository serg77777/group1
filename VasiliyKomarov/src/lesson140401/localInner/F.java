package lesson140401.localInner;

public class F implements X {
	int state = 30;
	
	public I getI() {
		return new I() {
			@Override
			public void doIt() {
				System.out.println("i did it anonymously " + state);				
			}
		};
	}
}
