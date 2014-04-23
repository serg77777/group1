package lesson140226;

public class C {

	B b;

	C() {

	}

	C(B b) {

		this.b = b;
	}

	void doIt() {

		if (b == null) {
			b = new B("C slave");
		}
		b.doIt();
	}

	void doItAgainWith(B b) {

		b.doIt();
	}

}
