package lesson140227;

public class C {

//	D d = new D("init field");
	D d;
	{
//		d = new D("init instance");
		System.out.println("d= " + d) ;
	}
	
	C() {
//	d = new D("default constructor");
	}
	
	C (D d){
		this.d=d;
	}
	
	void doIt(){
		if (d == null){
			d = new D("lazy");
		}
		d.doIt();
	}
	void doIt (D d) {
		d.doIt();
	}
	
	void doIT2 (){
		new D ("Temporary internal worker").doIt();
	}
		
}
