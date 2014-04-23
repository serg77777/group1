package lesson140324;

public class C extends B {
	
	public void changeSteta() {
		state -= 100;
		super.changeState();
	}

	public static void main(String[] args) {
		C c = new C();
		c.changeState();
	}
	
}
