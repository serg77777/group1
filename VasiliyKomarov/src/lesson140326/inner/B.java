package lesson140326.inner;

public class B {

	int state = 30;
	
	class Bi {
		public void printState() {
			System.out.println(state);
		}
	}
}

//	Bi bi = new Bi();
//		B _b;
//		
//		Bi(B b) {
//			_b = b;
//		}
//			System.out.println(_b.state);