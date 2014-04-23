package lesson140324;

public class A {

	int state;
	public int getState() {
		return state;
	}
	public void changeState(){
		state+=10;
		//System.out.println("yes");
	}
	
	public void changeState(int change){
		state+=change;
		//System.out.println("yes");
	}
	public void changeState(boolean change){
		if (change){
			state+=100;
		}
		//System.out.println("yes");
	}
	public void changeState(int amount, boolean change){
		if (change) {
			state+=amount;
		}
	}
}
