package lesson140331.innerlocal;

public class L {

	interface Changer {
		void change();
	}

	static {
		System.out.println("static init");
	}
	
	int state;

	private void changeState() {
		state += 1;
	}

	public Changer getChanger(int addAmount) {
		
		final int add = addAmount % 10;
		
		class MyChanger implements Changer {

			@Override
			public void change() {
				state += add;
				changeState();
			}

		}
		
		return new MyChanger();
	}

	public static void main(String[] args) {
		L l = new L();
		Changer changer = l.getChanger(17);
		changer.change();
		System.out.println(l.state);
		
		l = new L();
	}
	
}
