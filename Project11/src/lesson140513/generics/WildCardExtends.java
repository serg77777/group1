package lesson140513.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardExtends {

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<>();
		List<Double> ld = new ArrayList<>();

		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		
		double sum = sum(li);
		System.out.println(sum);
		
		ld.add(3.5);
		ld.add(4.5);
		ld.add(5.5);
		
		double sum2 = sum(ld);
		System.out.println(sum2);

		List<Number> list3 = new ArrayList<>();
		
		list3.add(10);
		list3.add(10.1);
		list3.add(10f);
		list3.add(0xf);
		
		System.out.println(sum(list3));
		
	}

	private static double sum(List<? extends Number> li) {
		double sum = 0;
		for (Number number : li) {
			sum = sum + number.doubleValue();
		}
		
//		li.add(sum);
		return sum;
	}
	
}
