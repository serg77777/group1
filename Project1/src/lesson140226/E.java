package lesson140226;

public class E {
	
	{
		System.out.println("initialized " + this);
	}

	E(int s) {
		System.out.println("created " + this);
	}
	
	protected void finilize() throws Throwable {
		
		System.out.println("destroyed " + this);
	}
}
