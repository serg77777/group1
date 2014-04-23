package lesson140331;

public class LocalExample {

	
	interface Jumper{
		void jump();
		
	} 
	
	 public static void main(String[] args) {
		Jumper [] jumpers = createTwins();
				
		for (Jumper jumper : jumpers) {
			jumper.jump();
			//Person person = (Person) jumper; 
		}
	}
	
	 private static Jumper[] createTwins() {
	 
	 class Person implements Jumper{
		 String name;
		 String surname;
		 
		 {
			 System.out.println("Init");
		 }
		 
		 public Person (String name, String surname) {
			this.name = name;
			this.surname = surname;
		}
	 	 
	 @Override
	 public void jump (){
		 System.out.println(name + " " + surname + " jump-jump");
	 }
	 }	 
	 Person first = new Person("John","Smit");
	 Person second = new Person("Barry","Goodwin");
	 
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
			System.out.println( _name+ " jumps");
			}
		};
	 }
}

