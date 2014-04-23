package lesson140325;

public class A implements Changeable {

	int state = 20;
	
	public int getState() {
		return state;
	}
	
	public void changeState() {
		state += 10;
		System.out.println("a");
	}

	public void changeState(int amount) {
		state += amount;
	}
	
}
