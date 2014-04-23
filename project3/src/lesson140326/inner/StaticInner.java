package lesson140326.inner;

public class StaticInner {

	static class Ai{
		
	}
	
	public static void main(String[] args) {
		StaticInner.Ai a = new StaticInner.Ai();
		A a2 = new A();
		A.Ai a3 = new A.Ai();
		A.Ai.printCounter();
		System.out.println(a2.getState());
		a3.printState();
		a3.printCounter();
		
	}
}
