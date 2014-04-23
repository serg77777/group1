package Lesson140304.internal;

import java.util.concurrent.TimeUnit;

public class StaticExample {
	
	
	public static void main(String[] args) throws InterruptedException {
		D d1 = new D();
		D d2 = new D();
		D d3 = new D();
		
//		Singleton singleton = new Singleton();
		Singleton.report();
		
		TimeUnit.SECONDS.sleep(10);
		
		System.out.println("Singleto state is " +
				Singleton.get().getState());
		System.out.println("Singleto state is " +
				Singleton.get().getState());
		System.out.println("Singleto state is " +
				Singleton.get().getState());
		
	}
}
