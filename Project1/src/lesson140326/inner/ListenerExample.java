package lesson140326.inner;

public class ListenerExample {

	public static class Conditioner implements TemperatireListener {

		public void hot() {
			System.out.println("Condition ON");
		}

		public void cold() {
			System.out.println("Condion OFF");
		}

		/* (non-Javadoc)
		 * @see lesson140326.inner.TemperatireLIstener#changed(int)
		 */
		@Override
		public void changed(int temp) {
			if(temp >= 30){
				hot();
			}
			if(temp < 0){
				cold();
			}
		}

	}

	static class Termometr{
		
		int temp;
		private TemperatireListener _observer;
		
		public void setListener(TemperatireListener observer){
			_observer = observer;
			
		}
		
		public void inc(){
			temp++;
			_observer.changed(temp);
			

		}
		
		public void des(){
			temp--;
			_observer.changed(temp);

		}
	}
	
	public static void main(String[] args) {
		Termometr t = new Termometr();
		TemperatireListener o = new Conditioner();
		t.setListener(o);
		
		t.des();
		
		t.setListener(new TemperatireListener() {
			
			@Override
			public void changed(int temp) {
				System.out.println("Anonimus cracked you.");
//				o.changed(temp);
			}
		});
	}
}
