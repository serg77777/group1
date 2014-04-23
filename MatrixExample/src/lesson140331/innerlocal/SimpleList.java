package lesson140331.innerlocal;

public interface SimpleList extends Iterable {
	void add(String element);

	boolean hasNext();

	Object next();

	void remove();

	void add(Object element);

}
