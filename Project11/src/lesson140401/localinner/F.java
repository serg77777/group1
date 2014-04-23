package lesson140401.localinner;

public class F implements X{

	int state = 30;
	
	@Override
	public I getI(){
		return new I(){
			@Override
			public void doIt(){
				System.out.println("I did it anonymously "+ state);
			}
		}
	;
}
}