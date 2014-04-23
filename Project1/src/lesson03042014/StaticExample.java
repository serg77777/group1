package lesson03042014;

import java.util.concurrent.TimeUnit;

public class StaticExample {
	
		public static void main(String[] args) throws InterruptedException{
			new D();
			new D();
			new D();
			new D();
			new D();
			new D();
			D d = new D();
			Class class1 =d.getClass();
			System.out.println(d.getC());
			D.report();System.out.println(d.getClass());
			D.report();System.out.println(class1);
			
			Singleton singleton = new Singleton();
			Singleton.report();
			TimeUnit.SECONDS.sleep(10);
			System.out.println("Sing state is "+ Singleton.get().getState());
			System.out.println("Sing state is "+ Singleton.get().getState());
			System.out.println("Sing state is "+ Singleton.get().getState());

		}
}
