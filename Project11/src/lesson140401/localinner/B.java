package lesson140401.localinner;

public class B implements X{

	@Override
	public I getI() {
		return new OuterI();
	}
	
}
