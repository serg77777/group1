package lesson140226;

public class E {

	{
		System.out.println("Initialized: " + this);
	}

	public E(int i) {

		System.out.println("i = " + i);
	}

	public E() {

		System.out.println("created: " + this);
	}

	@Override
	protected void finalize() throws Throwable {

		System.out.println("Destroyed: " + this);
		super.finalize();
	}
}
