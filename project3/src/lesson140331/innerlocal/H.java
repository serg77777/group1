package lesson140331.innerlocal;

public class H implements Changeable{
	
	int state=10;

	@Override
	public void changeState(){
		state *=20;
	}

	@Override
	public Object getState() {
		return state;
		
	}
}
