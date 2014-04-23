package lesson140326.inner;

public class ListenerExample {

	public static class Conditioner {

		public void hot() {

			System.out.println("cond ON");

		}

		public void cold() {

			System.out.println("cond OFF");

		}

	}

	static class Termometer {

		int temp = 0;
		private Conditioner _observer;

		public void setListener(Conditioner observer) {

			_observer = observer;
		}

		public void inc() {

			temp++;
			if (temp >= 30) {
				_observer.hot();
			}

		}

		public void dec() {

			temp--;
			if (temp <= 0)
				_observer.cold();
		}
	}

	public static void main(String[] args) {

		Termometer t = new Termometer();
		TemperatureListener o = new Conditioner();
		t.setListener(o);
		t.dec();
		
		t.setListener

	}
}
