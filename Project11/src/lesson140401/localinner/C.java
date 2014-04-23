package lesson140401.localinner;

public class C implements X{

	public static class StaticInner implements I{
		@Override
		public void doIt() {
			System.out.println("I did it, " + "but from inside");
		}
	}
	
	
	@Override
	public I getI() {
		return new StaticInner();
	}


}
