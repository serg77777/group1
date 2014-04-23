package lesson140227;

public class C {
	
	D d = new D("init field");  // 1
	
	{
		d = new D("init instance");   // 2
		System.out.println("d = " + d);
	}
	C() {
		d = new D("default constructor");  //3
	}
	
	C(D d) {
		this.d = d;
	}
	
	void doIt() {
		d.doIt();
	}
}
                                            