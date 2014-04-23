package lesson140401.localinner;

import lesson140313.interfaces.MyList1;
import lesson140313.interfaces.SimpleList;

public class LocalInner {
	
	interface Jumper {
		void jump();
	}
	
//	static class Twins {
//		Jumper elder;
//		Jumper junior;
//	}
	
	
	public static void main(String[] args) {
		SimpleList jumpers = createJumpers();
		for (Object object : jumpers) {
			Jumper jumper = (Jumper) object;
			jumper.jump();
		}
		
//		Person person = new Person(); 
	}

	private static SimpleList createJumpers() {
		
		SimpleList jumpers = new MyList1();
		
		class Person implements Jumper {
			
			String name;
			
			Person(String name) {
				this.name = name;
			}
			
			@Override
			public void jump() {
				System.out.println(name + " jump!");
			}
			
		}	
		
		jumpers.add(new Person("John"));
		jumpers.add(new Person("Ann"));
		jumpers.add(new Person("Pete"));
		
		return jumpers;
	}
}
