package lesson140326.inner;

public class B {

	int state = 30;
	Bi bi = new Bi();
	
	class Bi {
		
		public void printState() {
			System.out.println(state);
		}
	}
	
	public void printMyState() {
		bi.printState();
	}
	
}
