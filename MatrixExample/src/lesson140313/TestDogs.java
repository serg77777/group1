package lesson140313;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestDogs {
	public static void main(String[] args) {
		List<Dog> dogs = new LinkedList<>();
		dogs.add(new Dog("Шарик", 10, 4, 5));
		dogs.add(new Dog("Лорд", 20, 10, 40));
		dogs.add(new Dog("Сосиска", 2, 10, 3));
		
		Collections.sort(dogs);
		
		Dog[] dogsArray = new Dog[3];
		for (int i = 0; i < dogsArray.length; i++) {
			dogsArray[i] = dogs.get(i);
			System.out.println(dogsArray[i].name);
		}
		
		for (Dog dog : dogs) {
			System.out.println(dog.name);
		}
		
		Arrays.sort(dogsArray);
		for (Dog dog : dogsArray) {
			System.out.println(dog.name);
		}
		
	}
}
