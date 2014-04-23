package lesson140401.localinner;

public class C implements I, X{
	
	
	
	public static class StaticInner implements I{
		@Override
		public void doIt(){
			System.out.println("I did it from inside " );
		}

		@Override
		public I getI() {
			// TODO Auto-generated method stub
			return this;
		}
		
	}
	
	
	@Override
	public I getI() {
		return new StaticInner();
	}


	@Override
	public void doIt() {
		// TODO Auto-generated method stub
		
	}
	
}
