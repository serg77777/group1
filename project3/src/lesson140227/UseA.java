package lesson140227;

public class UseA {

	public static void main(String[] args) {

		int i = 0;
		A a = new A(); // instance
		a.changeState();
		System.out.println(a.state);

		A a2 = new A(); // instance
		a2.changeState();
		a2.changeState();
		//System.out.println(a2.state);

		A a3 = a;
		System.out.println(a3.state);
		a3.changeState();
		System.out.println(a3.state);

		A a4 = null;
		System.out.println(a4);
		if (a4 != null) {
			a4.changeState();
		}

	}
}
