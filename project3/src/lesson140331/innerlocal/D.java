package lesson140331.innerlocal;

public class D implements X {

	int state = 20;
	
	public class InnerImplementorOfI implements I, X {

		@Override
		public void doIt() {
			System.out.println("I did it, but from inside with state " + state);
		}

		@Override
		public X getImplementorOfI() {
			// TODO Auto-generated method stub
			return null;
		}



	}



	@Override
	public void doIt() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public X getImplementorOfI() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
