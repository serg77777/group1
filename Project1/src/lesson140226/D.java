package lesson140226;

public class D {
void doit(D d){
	System.out.println("I said DO it to " + d);
	d.doit(this);
}
}
