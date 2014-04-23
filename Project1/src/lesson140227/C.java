package lesson140227;

public class C {
	
	D d = new D("init fiels");
	
	{
		d =new D("init instance");
		System.out.println("d = " +d);
		
	}
	
	C() {
		d =new D("default constr");
		
	}
	
	C(D d) {
		this.d = d;
	}
	
	void doIt() {
		d.doIt();
	}
	
	void doIt(D d) {
		
		d.doIt();
	}
	
	void setD(D d) {
		this.d = d;
		
	}
	
	void doIt2() {
		new D("temporary internal worker").doIt();
	}
	void doIt(){
		if(d==null){
			d=new D("lazy");
		}
		d.doIt();
	}
}
