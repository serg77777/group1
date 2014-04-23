package lesson140331.innerlocal;

public class F implements X {

	int state = 40;
	
	@Override
	public X getImplementorOfI() {
		return new I() {

			@Override
			public void doIt() {
				System.out.println("I did it anonimously, state = " + state);
			}
		};
	}

	@Override
	public void doIt() {
		// TODO Auto-generated method stub
		
	}

}
