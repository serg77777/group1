package lesson140401.localinner;

public class E implements X{
int state = 10;
	@Override
	public I getI() {
		class Local implements I{
			@Override
			public void doIt(){
				System.out.println("I did it localy");
			}
	}
	return new Local();
}
}