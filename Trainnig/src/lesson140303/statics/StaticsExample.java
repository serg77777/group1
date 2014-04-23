package lesson140303.statics;

public class StaticsExample {

	public static void main(String[] args) throws InterruptedException {

		Singleton.printStatus();
		A.classMethod();
		// A.instanceMethod(); ERROR
		A a = new A();
		a.instanceMethod();

		// a.classMethod(); WARNING

		new A();
		new A();
		new A();

		System.out.println(A.getCount());

		for (A aObject : A.objects) {
			System.out.println(aObject._name);
		}

		// TimeUnit.SECONDS.sleep(5);
		Singleton.getInstance().doSomething();
		Singleton.getInstance().doSomething();
		Singleton.getInstance().doSomething();
	}

}
