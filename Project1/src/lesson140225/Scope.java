package lesson140225;

public class Scope {
	
	public static int x =20;

	public static void main(String[] args) {
		
		int a = 0;
		
		{
			int b = 10;
			{
				int c =20;
				System.out.println(c);
			}
//			System.out.println(c); error
		}
//		b =40;

	}
//	a =40;

}
