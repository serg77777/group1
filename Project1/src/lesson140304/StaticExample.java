package lesson140304;

import java.util.concurrent.TimeUnit;

public class StaticExample {
 

	
	public static void main(String[] args) throws InterruptedException {
		new D();
		new D();
		new D();
		new D();

	    D d = new D();
	    
	    System.out.println(d.getC());
	    
	    //D.report(); don't do like this
	    
	    
	    Class<? extends D> class1 = d.getClass();
	    System.out.println(class1.getClass());
		System.out.println(class1);
		
//		Singleton singleton = new Singleton(); ERROR
		
		
		Singleton.report();
		
		
		TimeUnit.SECONDS.sleep(10);
		
		System.out.println("Singletone state is " + Singleton.get());
		System.out.println("Singletone state is " + Singleton.get());
		System.out.println("Singletone state is " + Singleton.get());
		System.out.println("Singletone state is " + Singleton.get());
		
		
		
	
	}
	
}
