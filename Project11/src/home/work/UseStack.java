package home.work;

public class UseStack {

	public static void main(String[] args) {

		MyStack<Integer> ms = new MyStack<>();

		for (int i = 0; i < 10; i++) {
			ms.add(i);

		}
		Integer msi;
		while (ms.isEmpty()) {
			msi = ms.pop();
			System.out.println(msi);
		}

		MyStack<String> mss = new MyStack<>();

		mss.add("aaaa");
		mss.add("bbbb");
		mss.add("cccc");
		String msss;
		while (mss.isEmpty()) {
			msss = mss.pop();
			System.out.println(msss);
		}
	}

}
