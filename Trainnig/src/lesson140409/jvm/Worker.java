package lesson140409.jvm;

import java.util.Random;

public class Worker {

	static class Data {

		int[] _data = new int[10000];
	}

	public static void main(String[] args) {

		while (true) {
			work();
			rest();
		}
	}

	private static void rest() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void work() {

		Random r = new Random();
		for (int i = 0; i < 10000; i++) {
			Data d = new Data();
			for (int j = 0; j < d._data.length; j++) {
				d._data[i] = r.nextInt();
			}
		}
	}
}
