package lesson140327.inner;

public class D {

	int state;
	
	public Printer getPrinter() {
		return new Printer(){
	
	
			public void printState() {
	
				System.out.println(state);
			}
		};
	}
}
