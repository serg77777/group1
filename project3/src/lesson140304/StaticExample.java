package lesson140304;

import java.util.concurrent.TimeUnit;

public class StaticExample {
	
	public static void main(String[] args) throws InterruptedException {
		new D();
		new D();
		new D();
		D d = new D();
	
		System.out.println(d.getC());
		
		D.report();
		
		Class class1 = d.getClass();
		System.out.println(class1.getClass());
		System.out.println(class1);
		
//		Singleton singleton = new Singleton();
		
		Singleton.report(); 
		TimeUnit.SECONDS.sleep(10);
		
		System.out.println("Singleton state is " + Singleton.get().getState());
		System.out.println("Singleton state is " + Singleton.get().getState());
		System.out.println("Singleton state is " + Singleton.get().getState());

		
	}
}
