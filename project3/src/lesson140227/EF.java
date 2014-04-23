package lesson140227;

public class EF {

	public static void main(String[] args) {
		E e = new E("Pit");
		F f = new F("Nick");
		e.f=f;
		f.e=e;
		f.doIt();

	}

}
