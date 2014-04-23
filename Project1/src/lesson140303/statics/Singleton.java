package lesson140303.statics;

public class Singleton {
	
	private static Singleton instance;
	int id;
	static int count;
	
	static void printStatus() {
		System.out.println("instances created = " + count);
	}
	
	{
		id = count++;
		System.out.println("I am newly created singleton #" + count);
	}

	private Singleton() {
	}

	public void saySomething() {
		// TODO Auto-generated method stub
		System.out.println("Singleton from " + id);
	}

	static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	static void setInstance(Singleton instance) {
		Singleton.instance = instance;
	}
	
}
