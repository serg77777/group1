package lesson140226;

public class UseA {

	public static void main(String[] args) {
		A a = new A(5);
		a.changeState();
		System.out.println(a.state);
		a.changeState();
		System.out.println(a.state);

		A a2 = new A();
		System.out.println(a2.state);
		a2.changeState();
		System.out.println(a2.state);

		System.out.println(a);
		System.out.println(a2);

		A a3 = a;
		a3.changeState();
		System.out.println(a.state);

	}

}
