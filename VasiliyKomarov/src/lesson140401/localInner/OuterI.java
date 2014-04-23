package lesson140401.localInner;

public class OuterI implements I {

	@Override
	public void doIt() {
		System.out.println("I did it from outside");
	}

}
