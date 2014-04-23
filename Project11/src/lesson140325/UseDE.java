package lesson140325;

public class UseDE {

	public static void main(String[] args) {

		D d = new D();
		E e = new E();
		A a = new A();

		use(d);
		use(e);
		use(a);
		

	}

	private static void use(Changable obj) {//chistii polimorfizm
		obj.changeState();
//		if (obj instanceof D) {
//			D d = (D) obj;
//			d.changeState();
//			return;
//		}
//		if (obj instanceof E) {
//			E e = (E) obj;
//			e.changeState();
//			return;
//		}
//		if (obj instanceof A) {
//			A a = (A) obj;
//			a.changeState();
//			return;
//		}

	}

}
