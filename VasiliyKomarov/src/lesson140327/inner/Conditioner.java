package lesson140327.inner;

public class Conditioner {
	
	
	public void TemperatureObserver() {
		
	}

	public void hot() {
			System.out.println("Conditioner ON");
	}

	public void cold() {
		System.out.println("Conditioner OFF");
	}

	public static void main(String[] args) {
		Conditioner c = new Conditioner();
		Termometer t = new Termometer();
		
		t.setObserver(c);
		
		t.inc();
		t.inc();
		t.inc();
		t.dec();
		t.dec();
		t.dec();
		t.dec();
		
	}
	
}
