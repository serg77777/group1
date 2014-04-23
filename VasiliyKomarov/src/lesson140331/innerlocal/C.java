package lesson140331.innerlocal;

public class C {
	
	public static class StaticInnerImplementer implements I {

		@Override
		public void aoIt() {
			System.out.println("I did it, but from inside");			
		}

	}

	public I getImplementorOfI(){
		return new StaticInnerImplementer();
	}
	
}
