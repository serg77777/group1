package lesson140331.innerlocal;

public abstract class C implements X {

	public static class StaticInner implements I {
		
		@Override
		public void doIt() {
			System.out.println("I did it with static inner");
		}
		
	}

	@Override
	public I getI() {
		return new StaticInner();
	}














	
}
