package lesson140227;

import java.util.concurrent.TimeUnit;

public class lifeCicle {
	static class A {
		{System.out.println("created");}
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("destroyed");
	}

	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 0; i < 1000000; i++) {
			new A();
		}
		
		
//		System.gc();
		
//		TimeUnit.SECONDS.sleep(10);
	}
}
