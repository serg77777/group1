package lesson140326.inner;

public class Ci {

	C _c;
	
	
	public Ci(C c){
		_c = c;
	}
	
	public void printState(){
		System.out.println(_c.state);
	}
}
