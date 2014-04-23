package lesson140324;

public class UsePoly {

	public static void main(String[] args) {
		
		int i = 0;
		
		Integer a = 0;
		useInt(a);
		System.out.println(a);
		a++;
		System.out.println(a);
		
		/*A some = new A();
		some.state = 6;
		useInt(some);
		System.out.println(some.state);*/
		
		useNumber(i);
		useNumber(new MyInteger(100));
	}
	
	private static void useNumber(Number i) {
		// TODO Auto-generated method stub
		System.out.println(i.intValue());
	}

	public void changeIt(A a)  {
		a.changeState();
	}
	
	public static void useInt(Integer i) {
		i = 5;
	}
	
	public static void useInt(A i) {
		i.state = 5;
	}
	
}
