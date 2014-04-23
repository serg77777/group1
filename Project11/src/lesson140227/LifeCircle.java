package lesson140227;

import java.util.concurrent.TimeUnit;

public class LifeCircle {
	
	static class A {
		{
			System.out.print("created");
			System.out.println("");
		}
		
		
		@Override
		protected void finalize() throws Throwable {
			System.out.print("destroyed");
			System.out.println("");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		A[] arrayOfA = new A[1000000];
 		
		for (int i = 0; i < 1000000; i++) {
			System.out.print(i + " < ");
			new A();	
			arrayOfA[i] = new A();
			if (i > 0) {
				arrayOfA[i-1] = null;
			}
		}
		
		
//		System.gc();
		
//		TimeUnit.SECONDS.sleep(10);
		
		
	}
	
}
