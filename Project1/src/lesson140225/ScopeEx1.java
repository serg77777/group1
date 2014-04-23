package lesson140225;

public class ScopeEx1 {
	public static int x = -20;

	public static void main(String[] args) {

		int a = 0;
	}

	int b = 10;
	{
		int c = 20;
		System.out.println();
	}

}
