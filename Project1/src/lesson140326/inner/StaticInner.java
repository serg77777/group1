package lesson140326.inner;

public class StaticInner {

	static class Ai{
		
	}
	
	public static void main(String[] args) {
		StaticInner.Ai a = new StaticInner.Ai();
		
		A a2 = new A();
		A.Ai ai = new A.Ai(); // ERROR
		
		ai.printCounter();
		
		A.Ai.printCounter();
		
		a2.getState();
	}
	
}
