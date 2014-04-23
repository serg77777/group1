package lesson140324;

public class A {
	int state;

	// OVERLOAD
	public int getState() {
		return state;
	}

	public void changeState() {
		state += 10;
	}

	public void changeState(int diff) {
		state += diff;
	}

	public void changeState(boolean diff) {
		if (diff) {
			state += 100;
		}
	}

	public void changeState(boolean change, int amount) {
		if (change) {
			changeState(amount);
		}
	}

	public void changeState(int amount, boolean change) {
		if (change) {
			changeState(amount);
		}
	}
}
