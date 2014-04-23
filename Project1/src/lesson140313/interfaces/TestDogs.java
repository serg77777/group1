package lesson140313.interfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestDogs {

	public static void main(String[] args) {
		List<Dog> dogs = new LinkedList<>();
		
		dogs.add(new Dog("Sharik", 19, 4, 5));
		dogs.add(new Dog("Lord", 20, 9, 40));
		dogs.add(new Dog("Soska", 6, 9, 3));
		

		Dog[] dogsArray = new Dog[3];
		
		for (int i = 0; i < dogsArray.length; i++) {
			dogsArray[i] = dogs.get(i);
			System.out.println(dogsArray[i].name);
		}
		
		Collections.sort(dogs);

		for (Dog dog : dogs) {
			System.out.println(dog.name);
		}
		
		Arrays.sort(dogsArray);
		for (Dog dog : dogsArray) {
			System.out.println(dog.name);
		}
		
	}
	
}
