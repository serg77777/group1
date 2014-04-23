package lesson140303.statics;

import java.util.ArrayList;
import java.util.List;

public class A {

	static int count;
	static List<A> objects = new ArrayList<A>();
	String _name;
	int state;

	{
		objects.add(this);
		count++;
	}

	public A() {

		_name = "I'm the instance of A number " + count;
		System.out.println(_name);
	}

	static int getCount() {

		return count;
	}

	static public void classMethod() {

		System.out.println("Class method " + A.class);
	}

	public void instanceMethod() {

		System.out.println("Instance method " + this.getClass());
		System.out.println(this.getClass().getClass());
	}

}
