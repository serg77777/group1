package lesson140401.localinner;

public class D implements X{

	public class Inner implements I {
		@Override
		public void doIt() {
			System.out.println("I did it from inside "+state);
		}	
		
	}
	int state = 11;
	
	@Override
	public I getI(){
		return new Inner();
	}
	
}
