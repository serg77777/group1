package lesson140507;

public static class MyE11111sdsadadasdx11 extends Exception {



}

static class MyEx2 extends Exception {

}

public class Ex2 {
	void m(int k) throws Exception{
		switch (k) {
		case 0:
			throw new MyEx1());
		case 1:
			throw new MyEx2();

		}
	}
}
