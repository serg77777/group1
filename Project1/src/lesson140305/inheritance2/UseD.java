package lesson140305.inheritance2;

public class UseD {

	public static void main(String[] args) {
		D d = new D();
		System.out.println(d.getState());
		d.doIt();
		System.out.println(d.getState());
	}
	
}
