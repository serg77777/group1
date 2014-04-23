package lesson140324;

public class F extends E {

	private int state1 = 6;
	
	public static void main(String[] args) {
		F f = new F();
		f.printState();
	}

	public int getState() {
		return state1;
	}

	public void setState(int state) {
		this.state1 = state;
	}
}
