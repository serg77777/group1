package lesson140326.inner;

public class A {

	private static int counter;
	private int state = 20;
	
	 static class Ai {
		
		 public static void printCounter() {
			 System.out.println(counter);
		 }
		 
	}
	
	 public int getState() {
		 return state;
	 }
	
}
