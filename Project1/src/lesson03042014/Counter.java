package lesson03042014;

public class Counter {
	public int count;
	public void inc(){
		count++;
		System.out.println("write new count : "+ count);
		
	}
	public int get(){
		System.out.println("get current count : "+ count);
		return count;
	}

}
