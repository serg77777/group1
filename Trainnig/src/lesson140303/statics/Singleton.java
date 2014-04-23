package lesson140303.statics;

public class Singleton {

	private static Singleton instance;
	static int count;
	int id;

	static Singleton getInstance() {

		if (instance == null) { // lazy instantiation
			instance = new Singleton();
		}
		return instance;
	}

	static void setInstance(Singleton _instance) {

		Singleton.instance = _instance;
	}

	static void printStatus() {

		System.out.println("instances created: " + count);
	}

	{
		id = count++;
		System.out.println("I'm newly created singleton # " + id);
	}

	private Singleton() {

	}

	public void doSomething() {

		System.out.println("Doing something... Instance # " + id);

	}

}
