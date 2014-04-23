package lesson140326.inner;

public class ListenerExample {
	
	public static class Conditioner {

		public void hot() {
			if (temp >= 30) {
				System.out.println("conditioning on");
			}
		}

		public void cold() {
			System.out.println("conditioning off");
		}

		public void changed(int temp) {
			if (temp >= 30) {
				hot();
			}
			// TODO Auto-generated method stub
			
		}

	}

	static class Termometr {
		
		int temp = 0;
		private Conditioner _observer;
		
		public void setListener(Conditioner observer) {
			_observer = observer;
			
		}
		
		public void inc() {
			temp++;
			_observer = changed();
		}
		

		private Conditioner changed() {
			// TODO Auto-generated method stub
			return null;
		}

		public void dec() {
			temp--;
			_observer.changed(temp);
		}
		}
	
	public static void main(String[] args) {
		Termometr t = new Termometr();
		Conditioner o = new Conditioner();
		t.setListener(o);
		t.dec();
		
//		t.setListener(new TemperatureListener()
//		@Override
//		public void changed(int temp) {
//			System.out.println("`кажется дождь начинается");
//		});
				
	}
	
}
