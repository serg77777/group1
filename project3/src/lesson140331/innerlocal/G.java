package lesson140331.innerlocal;

public class G implements Changeable{
	
	String state ="";
	@Override
	public void changeState(){
		state = state + " ha " + " ha ";
	}

	@Override
	public void getState() {
		return state;
	}
}
