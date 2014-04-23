package lesson140226;

import java.util.concurrent.TimeUnit;

public class objectLifeCycle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		E e = new E(10);
		
		
		System.gc();
		TimeUnit.SECONDS.sleep(15);
	}

}
