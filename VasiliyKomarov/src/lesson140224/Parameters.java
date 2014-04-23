package lesson140224;

public class Parameters {

	public static void main(String[] args) {
		int i=10;
		process(i);
		System.out.println(i);
	}

	private static void process(final int loci) {
		//j=i;
		loci=loci*2;
		System.out.println(loci);
		
	}

}
