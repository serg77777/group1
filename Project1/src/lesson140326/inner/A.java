package lesson140326.inner;

public class A {
	private static int counter;
	

	static class Ai{
		
		public static void printCounter(){
			System.out.println(counter);
		}
		
		
		public void printState(){
//			System.out.println(state);
		}
	}

	int state = 20;
	public void getState() {
		System.out.println(state);		
	}
	
	
}
