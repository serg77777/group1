package lesson140331.innerlocal;

public class L {
	
	interface Changer {
		void change();
	}
	
	
	int state;
	
	public void changeState() {
		state++;
	}
	
	public Changer getChanger() {
		
		class MyChanger implements Changer {
			@Override
			public void change() {
				state += 1000;
				changeState();
			}
		}
		
		return new MyChanger();
		
	}
	
	public static void main(String[] args) {
		L l = new L();
		Changer changer = l.getChanger();
		changer.change();System.out.println(l.state);
	}
}
