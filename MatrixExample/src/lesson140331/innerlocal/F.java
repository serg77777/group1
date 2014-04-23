package lesson140331.innerlocal;

public class F implements X {
	int state = 40;
	
	public I getImplementorOfI() {
		return new I() {

			@Override
			public void doIt() {
				System.out.println("this is annonimous class. Hes state = " + state);
			}
			
		};
		
		
	}
}
