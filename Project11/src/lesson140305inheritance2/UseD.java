package lesson140305inheritance2;

public class UseD {
	public static void main(String[] args) {
		D d = new D();
		System.out.println(d.getState());
		d.doIt();
		// d.changeState(); wrong
		System.out.println(d.getState());
	}
}
