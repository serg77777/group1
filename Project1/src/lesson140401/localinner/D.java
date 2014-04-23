package lesson140401.localinner;

public class D implements X {

	int state = 222;
	
	public class Inner implements I{
		@Override
		public void doIt(){
			System.out.println("I did it from inside " +state);
		}

		@Override
		public I getI() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	@Override
	public I getI(){
		return new Inner();
	}
	
}
