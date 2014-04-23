package lesson140327.inner;

public class Conditioner {

	public void hot() {
		System.out.println("on");
		
	}

	public void cold() {
		System.out.println("off");
		
	}

public static void main(String[] args) {
	Conditioner c = new Conditioner();
	Termometer t = new Termometer();
	
	t.setConditioner(c);
	
	t.inc();
	t.inc();
	t.inc();
	t.inc();
	t.inc();
	t.inc();
	t.dec();
	t.dec();
	t.dec();
	t.dec();
	t.dec();
	t.dec();
	
}	
}
