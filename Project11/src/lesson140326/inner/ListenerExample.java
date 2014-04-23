package lesson140326.inner;

public class ListenerExample {

	public static class Conditioner implements TempeartureListener {

		public void hot() {
			System.out.println("conditioning on");
		}

		public void cold() {
			System.out.println("conditioning off");
		}

		@Override
		public void changed(int temp) {
			if (temp >= 30) {
				hot();
			}
			if (temp < 0) {
				cold();
			}
		}

	}

	static class Termometer {

		int temp = 0;
		private TempeartureListener _observer;

		public void setListener(TempeartureListener observer) {
			_observer = observer;

		}

		public void inc() {
			temp++;
			_observer.changed(temp);
		}

		public void dec() {
			temp--;
			_observer.changed(temp);
		}
	}

	public static void main(String[] args) {

		Termometer t = new Termometer();
		TempeartureListener o = new Conditioner();
		t.setListener(o);
		t.dec();

		t.setListener(new TempeartureListener() { // anonimnii vnytrennii Listener

			@Override
			public void changed(int temp) {
				System.out.println("кажется, дождь начинается"); //its rain start
			}
		});
		
		t.inc();
		t.dec();
	}

}
