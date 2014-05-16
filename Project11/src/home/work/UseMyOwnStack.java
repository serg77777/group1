package home.work;

public class UseMyOwnStack {

	public static void main(String[] args) {

		MyOwnStack<String> moss = new MyOwnStack<>();
		if (moss.isEmpty())
			System.out.println("MOSS ������");
		System.out.println("��������� ����");
		moss.push("A");
		System.out.println("Push A");
		moss.push("B");
		System.out.println("Push B");

		System.out.println();
		System.out.println("��������� �������� �� �����");

		while (!moss.isEmpty()) {
			System.out.println("Pop: " + moss.pop());
		}
		if (moss.isEmpty())
			System.out.println("MOSS ������");
		System.out.println();

		MyOwnStack<Integer> mosi = new MyOwnStack<Integer>();
		if (mosi.isEmpty())
			System.out.println("MOSI ������");
		for (int i = 0; i <= 10; i++) {
			System.out.println("Push: " + i);
			mosi.push(i);
		}

		System.out.println();
		System.out.println("��������� �������� �� �����");

		while (!mosi.isEmpty()) {
			System.out.println("Pop: " + mosi.pop());
		}
		if (mosi.isEmpty())
			System.out.println("MOSI ������");
	}

}
