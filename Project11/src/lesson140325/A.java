package lesson140325;

public class A implements Changable{

	public int state;

	public int getState() {
		return state;
	}

	@Override
	public void changeState() {
		System.out.println("a");
		this.state += 10;
	}
	
	public void changeState(int amount) {
		this.state += amount;
	}


	
	
	
}
