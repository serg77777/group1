package lesson140326.inner;

public class StaticInner {

	static class Ai {
		
	}
	
	public static void main(String[] args) {
		
		StaticInner.Ai a = new StaticInner.Ai();
		B a2 = new B();
		B.Bi a3 = new B.Bi();
//		B.counter = 10;
		B.Bi.printCounter();
		System.out.println(a2.getState());
		
	}
	
}
