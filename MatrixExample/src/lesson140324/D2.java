package lesson140324;

public class D2 extends D1 {
	
	@Override
	public void d() {
		System.out.println("Level 2");
		super.d();
	}
	
	public static void main(String[] args) {
		D2 d2 = new D2();
		d2.d();
	}
}
