package lesson140401.localinner;

public class LocalInner {

	interface Jumper {
		void jumps();
	}
	
	static class Person implements Jumper {
		
		public void jumps(){
			
		}
	
	
//	static class Twins {
//		Jumper elder;
//		Jumper junior;
//	}
	public static void main(String[] args) {
	
		SimpleList jumpers = createJumpers();
		for (Object object : jumpers) {
			Jumper jumper = (Jumper) object;
			jumper.jumps();
		}
	}

	private static List createJumpers() {
		
		SimpleList jumpers = new MyList();
		
		class Person implements Jumper {
			//Jumper jumper = new Jumper() 
			
			String name;
			
			Person(String name) {
				this.name = name;
			}
			
			public void jumps() {
				System.out.println("jump!");
			}
			
			
		}
		jumpers.add(new Person());
		jumpers.add(new Person());
		jumpers.add(new Person());
	}
}
}