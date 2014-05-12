package lesson140507;

public class B {
	static class F {
		static {

		}
	}

	interface I {

	}

	@Override
	protected void finalize() throws Throwable {

	}

	I m() {
		class Alocal implements I {
			final static int X = 10;
		}

		return new Alocal();

	}
}
