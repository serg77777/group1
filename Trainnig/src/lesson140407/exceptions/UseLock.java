package lesson140407.exceptions;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UseLock {

	public static void main(String[] args) {

		Lock lock = new ReentrantLock();
		lock.lock();
		try {

		} finally {

		}
		lock.unlock();
	}
}
