package lesson140409.jvm;

public class A {
	
	int state = 10;
	
	public void changeState() {
		System.out.println("change state");
		state += 10;
	}
	
}
