package lesson140306.inheeritance;

public class Zoo {
	public static void main(String[] args) {
		Lion lion = new Lion();
		Monkey monkey = new Monkey();
//		Animal animal = new Animal(); Error: abstract
		
		lion.takeCare();
		monkey.takeCare();
		new Cat().takeCare();
		new Dog().takeCare();
		
		
	}
	
}
