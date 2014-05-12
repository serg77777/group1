package lesson140512.generics;

public class Util {

	public static <K, V> boolean equal(Pair<K, V> p1, Pair<K, V> p2) {

		return p1.key().equals(p2.key()) && p1.value().equals(p2.value());
	}

	public static void main(String[] args) {

		Pair<Integer, String> pair1 = new Pair<>(10, "hello");
		Pair<Integer, String> pair2 = new Pair<>(20, "hello");
		System.out.println(Util.<Integer, String> equal(pair1, pair2));
		boolean result = Util.equal(pair1, pair2); // type inference
		System.out.println(!result);
	}
}
