package lesson140226;

public class UseScope {

	public static void main(String[] args) {
		
		//B b = new B("First");
		C c= new C(new B("First"));
		{
			C c2= c;
			c2.doit();
		}
		c.doit();
		
		new C().doitAgainWith(new B("First"));
	}

}
