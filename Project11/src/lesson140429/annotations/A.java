package lesson140429.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
@What(description = "This is a class")
@MyAnno
@Marker //Override tipichniy primer markera
@Single(100)
//@Override - target METHOD
public class A {
	
//	@Marker - target TYPE
	@What(description = "that")
	@MyAnno(str = "Example", val = 100)
	@Deprecated
	public static void myMeth() {
		System.out.println("myMeth - deprecated");
	}
	
	
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		Class clazz = A.class;
		
		What what = (What) clazz.getAnnotation(What.class);
		System.out.println(what.description());
		
		try {
			Method method = clazz.getMethod("myMeth");
			
			@What(description = "local")
			MyAnno anno = method.getAnnotation(MyAnno.class);
			System.out.println(anno.str() + " " + anno.val());
			for (Annotation a : method.getAnnotations()) {
				System.out.println(a.toString());
			}
			
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		
		myMeth();
	}
}
