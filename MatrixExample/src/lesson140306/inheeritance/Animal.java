package lesson140306.inheeritance;

public abstract class Animal {
	public abstract void makeSound();
	
	public abstract void feed(String string);
	
	public void takeCare() {
		makeSound();
		feed("banana");
		feed("meat");
		
	}
	
}
