package lesson140401.localinner;

public class F  implements ImplementorOfI{
	public I getImplementationOfI(){
		final int state = 10;
		class Local implements I{

			@Override
			public void doIt() {
				System.out.println("I did it locally" + state);
				
			}			
		}
		
		return new Local();
	}
}
