package lesson140325;

public class B2 extends A {

	{
		state = 20;

	}

	@Override
	public void changeState() {

		state /= 2;
		super.changeState(100);
		state *= 3;

	}

}
