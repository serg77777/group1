
public class Operators {
	public static void main(String[] args) {
		
		int x = 20;
		if (x % 2 == 0) {
			System.out.println("четное");
		}
		else
		{
			System.out.println("Нечётное");
		}
		System.out.println(x % 2 == 0 ? "четное" : "нечетное");
		
		
		System.out.println(1 << 1);
		System.out.println(256 << 3);
	}
}
