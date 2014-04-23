package lesson140409.jvm;

public class Reflection {

	public static void main(String[] args) {

		Object o = new A();
		Class clazz = o.getClass();
		System.out.println(clazz);
		System.out.println(clazz.isAssignableFrom(B.class));
		System.out.println(clazz.isAssignableFrom(Object.class));
		System.out.println(clazz.isAssignableFrom(A.class));

		System.out.println(clazz.isAssignableFrom(A.class));

		System.out.println(A.class.isAssignableFrom(B.class));
		System.out.println(B.class.isAssignableFrom(A.class));

		System.out.println(A.class.isAssignableFrom(Object.class));
		System.out.println(Object.class.isAssignableFrom(A.class));

		System.out.println(clazz.isInstance(o));

		try {
			A a = (A) clazz.newInstance();
			System.out.println(a.getClass().getSimpleName());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Class c = Class.forName("lesson140409.jvm.B");
			Object obj = c.newInstance();
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException e) {

			e.printStackTrace();
		}
	}

}
