package lesson140401.localinner;

public class B implements ImplementorOfI
{

	
	public I getImplementationOfI(){
		return new OuterI();
	}
}
