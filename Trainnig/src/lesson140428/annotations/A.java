package lesson140428.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class A {

	@MyAnnotation(str = "Example")
	@ThatAnnotation("Hello!")
	@Marker
	@WhatAnnotation(description = "This is another annotation")
	@Deprecated
	public static void myMethod() {

		Class<A> clazz = A.class;
		try {
			Method method = clazz.getMethod("myMethod");
			MyAnnotation anno = method.getAnnotation(MyAnnotation.class);
			System.out.println("Str = " + anno.str() + "\t" + "val = "
					+ anno.val());

			for (Annotation annotation : method.getAnnotations()) {
				System.out.println(annotation);
			}
			System.out.println(method.isAnnotationPresent(Marker.class));
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		myMethod();
	}
}
