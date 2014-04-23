package lesson140327.inner;

public class Conditioner implements TemperatureObserver{
	
	public void currentTemp(int temp){
		if(temp>25){
		hot();
	}
		
		if(temp<20){
		cold();
	}
	}
	
	

	public void hot() {
		// TODO Auto-generated method stub
		System.out.println("conditioner on");
	}

	void cold() {
		// TODO Auto-generated method stub
	System.out.println("conditioner off");	
	}

	
	
	public static void main(String[] args) {
		Conditioner c = new Conditioner();
		Termometer t = new Termometer();
		t.setObserver(c);
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
		t.dec();
		t.dec();
		t.dec();
		
		t.setObserver(new TemperatureObserver (){
			@Override
			public void currentTemp(int temp){
				System.out.println("...");
			}
		});
		
	}



	@Override
	public void cirrentTemp(int temp) {
		// TODO Auto-generated method stub
		
	}
	
	
}
