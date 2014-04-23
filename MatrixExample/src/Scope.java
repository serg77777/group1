// Область действия переменных
public class Scope {
	
	public static void main(String[] args) {
		
		int a = 0;
		
		{
			int b = 10;
			{
				int c = 20;
			}
//			System.out.println(c); error!!!
		}
	}
}
