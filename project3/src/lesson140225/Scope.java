package lesson140225;

public class Scope {
	
	public static int t = 20;
	
	public static void main(String[] args) {
		int a = 0;
		
		{
			int b = 1;
			{
				int c = 2;
				System.out.println(a);
			}
		}
	}
}
