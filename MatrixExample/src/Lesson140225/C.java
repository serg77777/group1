package Lesson140225;

public class C {
	D d = new D();
	
	{
		d = new D();
		System.out.println("d = "+ d);
	}
	
	C() {
		d =new D();
	}
	void doIt() {
		d.doIt();
	}
	
}
