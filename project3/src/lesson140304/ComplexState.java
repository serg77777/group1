package lesson140304;

public class ComplexState {

	private int state1 = 10;
	public int state2 = 5;
	
	int getState1() {
		return state1;
	}
	
	void setState1(int state1) {
		this.state1 = state1;
	}
	
	int getState2() {
		return state2;
	}
	
	void setState2(int state2) {
		if(state2 > state1){
			return;
		}
		this.state2 = state2;
	}
	
}
