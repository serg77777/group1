package lesson140428.autoboxing;

import java.util.Hashtable;

public class Examples {

	public static void main(String[] args) {

		Integer i = new Integer(10);
		long l;
		l = i.longValue();
		Hashtable t = new Hashtable();
		t.put("john", "341-15-76");
		t.put("Stranger", "2-12-85-06");
		System.out.println(t.get("John"));
		t.put(new Integer(132465), "Smith");
		t.put(3216546, "Benedict"); // autoboxing
		l = i; // autounboxing
		Integer i1 = new Integer(42);
		Integer i2 = new Integer(42);
		System.out.println(i1 == i2);
	}

	static int getIntValue(Integer iv) {

		return iv;
	}
}
