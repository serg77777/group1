package lesson140324;

public class C extends B {

	@Override
	public void changeState() {

		state -= 100;
		super.changeState();

	}

	// overload =
	public void changeState(int change) {

		state += 10;
		// super.changeState();

	}

	public void changeState(boolean change) {

		if (change) {
			state += 100;
		}
		// super.changeState();

	}

	public void changeState(boolean change, int amount) {

		if (change) {
			state += amount;
		}
		// super.changeState();

	}

	public static void main(String[] args) {

		C c = new C();
	}
}
