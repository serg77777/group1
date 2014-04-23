package lesson140401.localInner;

public class E implements X {
	int state = 10;
	public I getI() {
		class Local implements I {

			@Override
			public void doIt() {
				System.out.println("i did it local");				
			}
			
		}
		return new Local();
	}
}
