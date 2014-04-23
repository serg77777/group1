package lesson140303.statics;

import java.util.ArrayList;
import java.util.List;



public class A {
	
	static int count;
	String _name;
	static List<A> objects = new ArrayList<A>();
	
	{
		objects.add(this);
		count++;
	}
	
	static int getCount() {
		return count;
	}

	public A() {
		_name = "I am an object of A number "+ count;
		System.out.println(_name);
	}
	
	public void instanceMethode() {
		
		System.out.println("instance method " + this.getClass());
		System.out.println(this.getClass().getClass());
	}
	
	public static void classMethod() {
		System.out.println("class method " + A.class);
	}
	
}
