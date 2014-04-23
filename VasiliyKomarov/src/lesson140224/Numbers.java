package lesson140224;

public class Numbers {

	public static void main(String[] args) {
		byte b=-128;
		b=127;
		//b=128; error
		
		char с = 65;
		//System.out.println(с);
		short s=16900;
		s=-1300;
		//System.out.println(Short.MIN_VALUE);
		//System.out.println(Short.MAX_VALUE);
//System.out.println(Character.MIN_VALUE);

int i= Integer.MAX_VALUE;
i=i+1;
//System.out.println(i);

long l= Long.MAX_VALUE;
//System.out.println(l);

float f=0.0f;
double d=0.0;
d=0.1e-10;
System.out.println(d);
boolean bool=true;
System.out.println(bool==false);

	}

}
