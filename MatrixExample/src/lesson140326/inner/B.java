package lesson140326.inner;

public class B {
	Bi bi = new Bi();
	int state = 30;
	
	class Bi  {
		
//		private B _b;
//		
//		Bi (B b) {
//			_b = b;
//		}
		
		public void printState() {
//			System.out.println(_b.state);
			System.out.println(state);
		}
	}

	public void printMyState() {
		System.out.println(state);
	}
	
}
