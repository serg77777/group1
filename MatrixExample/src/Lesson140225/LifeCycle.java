package Lesson140225;

import java.util.concurrent.TimeUnit;

public class LifeCycle {

	static class A {
		{ System.out.println("created");}
		protected void finalize() throws Throwable {
			System.out.println("destroyed");
		}
	}
	
	static class B {
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 100000; i++) {
			new A();	
		}
//		System.gc();
		
//		TimeUnit.SECONDS.sleep(10);
	}
}
