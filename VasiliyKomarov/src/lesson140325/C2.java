package lesson140325;

public class C2 extends B2 implements Changeable {

	@Override
	public void changeState() {
		System.out.println("c2");
		state = 0;
	}
	
}
