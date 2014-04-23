package lesson140227;

public class UseCD {

	
		public static void main(String[] args) {
			C c = new C();
			c.doIt();
			
			D d = new D("outer d");
			new C(d).doIt();
			new C(d).doIt();
		}
}
