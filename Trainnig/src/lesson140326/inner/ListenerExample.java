package lesson140326.inner;

public class ListenerExample {

	public static class Observer {

		public void hot() {

			System.out.println("Conditioning ON");

		}

		public void cold() {

			System.out.println("Conditioning OFF");
		}

	}

	static class Termometer {

		int temp = 0;
		private Observer _observer;

		public void setListener(Observer observer) {

			this._observer = observer;

		}

		public void inc() {

			temp++;
			if (temp >= 30) {
				_observer.hot();
			}
		}

		public void dec() {

			temp--;
			if (temp < 0) {
				_observer.cold();
			}
		}
	}

	public static void main(String[] args) {

		Termometer termometer = new Termometer();
		Observer observer = new Observer();
		termometer.setListener(observer);

		termometer.dec();
		for (int i = 0; i < 31; i++) {
			termometer.inc();
		}
	}
}
