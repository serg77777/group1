package lesson140403;

public class C implements X{

	public static class StaticInner implements I {
		public void doIt(){
			System.out.println("I did it static inner");
		}
	}
	
	public I getI(){
		return new StaticInner();
	}

}
