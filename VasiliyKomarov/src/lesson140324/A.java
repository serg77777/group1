package lesson140324;

public class A {
	
		int state;
		
		public int getState(){
			return state;
		}
		public void changeState() {
			state +=10;
		}
		
		public void changeState(int change) {
			state +=10;
		}

		public void changeState(boolean change) {
			if (change) {
				state +=10;
			}
		}

		public void changeState(boolean change, int amount) {
			if (change) {
				state += amount;
			}
		}
		
		
		

}
