package lesson140429.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import javax.lang.model.element.Element;

@Target(ElementType.TYPE)
public @interface Marker {

}
