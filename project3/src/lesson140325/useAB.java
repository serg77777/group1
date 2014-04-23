package lesson140325;

public class useAB {
	public static void main(String[] args) {
		
		A a = new A();
		a.changeState();
		System.out.println(a.getState());
		a = new B();
		a.changeState();
		System.out.println(a.getState());
		a = new B2();
		a.changeState();
		System.out.println(a.getState());
		a = new C2();
		a.changeState();
		System.out.println(a.getState());
		
	}
}
