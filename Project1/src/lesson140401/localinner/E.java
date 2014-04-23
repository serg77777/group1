package lesson140401.localinner;

public class E implements X {
	int state = 10;
	@Override
	public I getI(){
		class Local implements I{
			@Override
			public void doIt(){
				System.out.println("I did it locally " + state);
			}

			@Override
			public I getI() {
				// TODO Auto-generated method stub
				return null;
			}
		}

		return new Local();
	}
	

}
