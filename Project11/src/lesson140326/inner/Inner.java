package lesson140326.inner;

//import lesson140326.inner.BB.BBi;

public class Inner {

	public static void main(String[] args) {
		BB b = new BB();
		BB.BBi bi = b.new BBi();
		bi.printState();
		b.printMyState();
		
		BB b2 = new BB(); // simple inner// luchshe ostal'nix
		b2.printMyState();
		
		C c = new C();
		Ci ci = new Ci(c); // otdel'nii class
		
		D d = new D();
		D.Di di = new D.Di(d); //static inner
		
	}
}
