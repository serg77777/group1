package lesson140326.inner;



public class InnerExample {

	public static void main(String[] args) {
		
		B b = new B();
		B.Bi bi = b.new Bi();
		bi.printState();
		
		b.printMyState();

		C c = new C();
		
		Ci ci = new Ci(c);
	}

}
