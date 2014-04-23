package lesson140305;

public class inheritanceExamlpes {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		A a = new A();
		a.setState(10);

		System.out.println(a.setState());

		B b = new B();
		b.setState(20);
		b.doubleState();

		System.out.println(b);
	}

}
