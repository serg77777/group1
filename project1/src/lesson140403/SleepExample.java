package lesson140403;

public class SleepExample {

	public static void main(String[] args) {

		System.out.println("one");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("two");

	}
}
