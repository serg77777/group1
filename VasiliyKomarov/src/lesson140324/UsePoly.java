package lesson140324;

public class UsePoly {

	public static void main(String[] args) {
		int i = 0;
		
//		A a = new A();
//		
//		a = new C(); 
//		
//		a.changeState();
		
		useInt(i);
		
		useNumber(i);
		useNumber(new MyInteger(100));
	}
	
	private static void useNumber(Number i){
		System.out.println(i.intValue());
	}
	
	public void changeIt(A a){
		a.changeState();
	}
	
	public static void useInt(int param){
		
	}
	public static void useInt(Integer param){
		System.out.println(param);
	}
	
}
