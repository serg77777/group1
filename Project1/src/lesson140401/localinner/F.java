package lesson140401.localinner;

public class F implements X {

	int state = 30;
//	return new Local();
	
	@Override
	public I getI(){
		return new I()
		{
			@Override
			public void doIt(){
				System.out.println("I did it anonymously " + state);
			}

			@Override
			public I getI() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

}
