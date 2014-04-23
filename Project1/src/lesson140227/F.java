package lesson140227;

public class F {
	E e;
	String _name;
	
	F(String name) {
		_name = name;
	}
	public void doit() {
		System.out.println("do it" +e._name);
		e.doIt();
	}
}
