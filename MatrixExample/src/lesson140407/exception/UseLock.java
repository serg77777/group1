package lesson140407.exception;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UseLock {
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		
		lock.lock();
		try {
			// do somethink
		} finally {
			lock.unlock();
		}
	}
}
