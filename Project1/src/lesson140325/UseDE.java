package lesson140325;

public class UseDE {

	public static void main(String[] args) {
		
		D d = new D();
		E e = new E();
		A a = new A();
		
		use(d);
		use(e);
//	they're tall ._. and cute :3	use(a);
		
	}

	private static void use(Changeable object) {

		object.changeState();
//		if (object instanceof D) {
//			D d = (D)object;
//			d.changeState();
//			return;
//		}
//		if (object instanceof E) {
//			E e = (E)object;
//			e.changeState();
//			return;
//		}
//		if (object instanceof A) {
//			A a = (A)object;
//			a.changeState();
//			return;
//		}
	}
	
}
