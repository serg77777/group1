package lesson140401.localInner;

public class G implements Changeable {

	String state = "";
	
	/* (non-Javadoc)
	 * @see lesson140401.localInner.Changeable#changeState()
	 */
	@Override
	public String changeState() {
		return state = state + " ha ";
	}
	
	
}
