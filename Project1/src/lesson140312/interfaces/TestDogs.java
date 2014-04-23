package lesson140312.interfaces;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestDogs {

	public static void main(String[] args) {
		
		List<Dog> dogs = new LinkedList<Dog>();
		dogs.add(new Dog("Rex", 10, 20, 6));
		dogs.add(new Dog("Sharik", 5, 20, 5));
		dogs.add(new Dog("Bobik",  12, 21, 4));
		dogs.add(new Dog("Trezor", 12, 20, 4));
		
		Collections.sort(dogs);
		for (Dog dog : dogs) {
			System.out.println(dog.getName() + " S: " + dog.getSpeed());
		}
		
	}
	
}
