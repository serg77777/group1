package Lesson140304.internal;

public class D {
	static int count;
	static void report() {
		System.out.println("so far we have created " + count + "oject");
	}
	int c;
	{
		count++;
		c++;
		System.out.println("created new instance number " + count
				+ ". c " + c);
	}
}
