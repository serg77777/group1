package lesson140331.innerlocal;

public class LocalExample {

	interface Jumper {
		void jump();
	}
	
	
	public static void main(String[] args) {
		Jumper[] jumpers = createTwins();		
		for (Jumper jumper : jumpers) {
			jumper.jump();
		}
	
		createJumper("Bill").jump();
		
	}

	private static Jumper[] createTwins() {
		
		class Person implements Jumper {
			String name;
			String surname;
			
			public Person(String name, String surname) {
				super();
				this.name = name;
				this.surname = surname;
			}

			
			
			@Override
			public void jump() {
				System.out.println(name + " " + surname + " " + "makes jump-jump") ;
				
					
			}
		}
		
		Person first = new Person("John","Smith");
		Person second = new Person("Ann","Smith");
		
		return new Jumper[] {first, second};
	}

	private static Jumper createJumper(final String name){
		
		return new Jumper(){

			private String _name;
			
			{
				_name = name;
			}
			
			@Override
			public void jump() {

				System.out.println(_name + "jumps" );
				
			}
			
		};
	}
	
}
