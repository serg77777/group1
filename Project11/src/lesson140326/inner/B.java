package lesson140326.inner;

public class B {

	private static int counter;
	
	protected static class Bi {
		public static void printCounter() {
			System.out.println(counter);
		}
		
		public void printState() {
			System.out.println(state);
		}
	}

	private int state = 10;
	
	public int getState() {
		return state;
	}
}