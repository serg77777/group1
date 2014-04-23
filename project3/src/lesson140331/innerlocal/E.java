package lesson140331.innerlocal;

public class E implements X {

	int state = 30;
	
	@Override
	public X getImplementorOfI() {
			 int aa = 10;
		class LocalImplementorOfI implements I, X {
			
			@Override
			public void doIt() {
				System.out.println("I did locally, state = " + state);
			}

			@Override
			public X getImplementorOfI() {
				// TODO Auto-generated method stub
				return null;
			}
		}
		
		return new LocalImplementorOfI();
	}

	@Override
	public void doIt() {
		// TODO Auto-generated method stub
		
	}

}
