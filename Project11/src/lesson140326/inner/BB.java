package lesson140326.inner;

public class BB {

	int state = 30;
	
	BBi bi = new BBi();
	
	class BBi {
			public void printState() {
			System.out.println(state);
		}
	}
	
	void printMyState() {
		bi.printState();
	}
}
