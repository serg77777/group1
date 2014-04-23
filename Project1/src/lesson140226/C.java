package lesson140226;

public class C {
	B b;
	C(){
		 b= new B("slave of C");
	}
	
	C(B b){
		this.b = b;
	}
	void doit(){
		b.doit ();
	}
	void doitAgainWith(B b) {
		b.doit();
	}
}
