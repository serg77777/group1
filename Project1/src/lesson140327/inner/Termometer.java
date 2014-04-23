package lesson140327.inner;

public class Termometer {

	private int temp =23;
	
	private Conditioner c;
	
	public void setConditioner(Conditioner c) {
		this.c=c;
	}
	public void inc(){
		temp++;
		
		if (temp >25){
			c.hot();
		}
	}
	
	public void dec(){
		temp--;
		if (temp < 25){
			c.cold();
		}
	}
	
}
