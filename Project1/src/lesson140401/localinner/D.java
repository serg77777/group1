 package lesson140401.localinner;

public class D  implements ImplementorOfI{

	int state;
	
	public class Inner implements I{

		@Override
		public void doIt() {
			System.out.println("I  did it inner");			
		}
		
	}
	public I getImplementationOfI(){
		return new Inner();
	}
}
