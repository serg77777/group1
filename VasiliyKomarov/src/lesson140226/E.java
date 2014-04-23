package lesson140226;

public class E {

	{
		System.out.println("initialized" + this);
	}
		public E(int i) {
			System.out.println("xreated with i = " + i);
		}
	
	public E() {
		System.out.println("created" + this);
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("destroyed" + this);
	}
	
}
