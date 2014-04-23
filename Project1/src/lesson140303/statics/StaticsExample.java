package lesson140303.statics;

public class StaticsExample {

	public static void main(String[] args) {
		A.classMethod();
		A a = new A();
		a.instanceMethode();
		a.classMethod();
		
		new A();
		new A();
		new A();
		
		System.out.println(A.getCount());
		
		for (A objectOfA : A.objects) {
			System.out.println(objectOfA._name);
		}
		
		Singleton.getInstance().saySomething();
		Singleton.getInstance().saySomething();
		Singleton.getInstance().saySomething();
		
	}
	
}
