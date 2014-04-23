package lesson140227;

public class UseA {
	public static void main(String[] args) {
		
	 A a = new A();// instance создать экземпляр
	
	 a.changeState();
	 System.out.println(a.state);
	 System.out.println(a);
	 
	 A a2 = new A();
	 
	 a2.changeState();
	 a2.changeState();
	 System.out.println(a2.state);
	 System.out.println(a2);
	 
	 A a3 = a;
	 System.out.println(a3);
	 a3.changeState();
	 
	 System.out.println(a.state);
	 
	 A a4 = null;
	 System.out.println(a4);

	 
	}
}
