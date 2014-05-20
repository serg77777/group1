package homework.stack;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Vector;

import javax.crypto.spec.OAEPParameterSpec;

/*
 * Lukashina N.B.
 * 
 * Stack<T> based on array T[]
 * Supported increasing capacity
 */

// Thread unsafe class!
public class MyStack<T> implements Serializable, Cloneable, Iterable<T>,
	Collection<T>, List<T>, RandomAccess {
	private T[] data;
	private int dataCounter = 0;
	private int capacity = 0;
	
	private class MyStackIterator implements Iterator<T> {
		int next; // index of next element to return
		int last = -1; // last return element
		
		@Override
		public boolean hasNext() {
			if ( next < dataCounter ) {
				return true;
			}
			return false;
		}

		@Override
		public T next() throws NoSuchElementException {
			if ( next >= dataCounter ) {
				throw new NoSuchElementException();
			}
			last = next;
			++next;
			return data[last];
		}

		@Override
		public void remove() throws IllegalStateException {
			if ( last < 0 ) {
				throw new IllegalStateException();
			}
			System.arraycopy(data, last+1, data, last, dataCounter - last - 1);
			data[--dataCounter] = null;
			
			next = last;
			last = -1;
		}
		
	}
	
	private class MyStackListIterator extends MyStackIterator implements ListIterator<T> {

		public MyStackListIterator(int pos) {
			super();
			next = pos;
		}
		
		@Override
		public void add(T arg0) {
			if ( next + 1 >= capacity )
				throw new IndexOutOfBoundsException();
			data[next] = arg0;
			++dataCounter;
			++next;
		}

		@Override
		public boolean hasPrevious() {
			return next > 0;
		}

		@Override
		public int nextIndex() {
			return next;
		}

		@Override
		public T previous() {
			if ( next == 0 )
				throw new NoSuchElementException();
			return data[next - 1];
		}

		@Override
		public int previousIndex() {
			if ( next == 0 )
				return -1;
			return next - 1;
		}

		@Override
		public void set(T arg0) {
			if ( last == -1 )
				throw new IllegalStateException();
			data[last] = arg0;
		}
		
	}
	
	public MyStack(int maxSize) throws IllegalArgumentException {
		if ( maxSize < 0 ) {
			throw new IllegalArgumentException("Negative capacity specified");
		}
		data = (T[]) new Object[maxSize];
		capacity = maxSize;
		dataCounter = 0;
	}
	
	public int size() {
		return dataCounter;
	}
	
	public boolean empty() {
		return isEmpty();
	}
	
	public T peek() throws EmptyStackException {
		if ( empty() ) {
			throw new EmptyStackException();
		}
		return data[dataCounter-1];
	}
	
	public T pop() throws  EmptyStackException {
		T elem = peek();

		data[--dataCounter] = null; 
		
		return elem;
	}
	
	public T push(T item) throws StackOverflowError {
		add(item);
		return item;
	}
	
	public int search(Object o) {
		int pos = lastIndexOf(o);
		
		if ( pos < 0 ) {
			return -1;
		}
		else {
			return ( size() - pos );
		}
	}

	@Override
	public Iterator<T> iterator() {
		return new MyStackIterator();
	}
	
	private void increaseCapacity(int ensureValue) { // simple implement of ensuring array capacity
		T[] old = Arrays.copyOf(data, dataCounter);
		if ( ensureValue < capacity ) {
			data = (T[]) new Object[capacity*2];
			capacity *= 2;
		}
		else {
			while (ensureValue > capacity) {
				data = (T[]) new Object[capacity*2];
				ensureValue = ensureValue % capacity;
				capacity *= 2;
			}
		}
		for (int i = 0; i < old.length; i++) {
			data[i] = old[i];
		}
	}

	@Override
	public boolean add(T e) throws StackOverflowError {
		if ( dataCounter >= capacity ) {
			increaseCapacity(1);
			//throw new StackOverflowError();
		}
		data[dataCounter] = e;
		dataCounter++;
		return true;
	}

	@Override
	public boolean addAll(Collection<? extends T> c)  throws IndexOutOfBoundsException, NullPointerException {
		if ( c.size()+dataCounter >= capacity ) {
			increaseCapacity(c.size());
			//throw new StackOverflowError();
		}
		Object[] array = c.toArray();
		System.arraycopy(array, 0, data, dataCounter, array.length);
		dataCounter += array.length;
		return true;
	}

	@Override
	public void clear() {
		for (int i = 0; i < dataCounter; i++) {
			data[i] = null;
		}
		dataCounter = 0;
	}

	@Override
	public boolean contains(Object o) {
		T elem = (T)o;
		for (int i = 0; i < dataCounter; i++) {
			if ( elem.equals(data[i]) )
				return true;
		}
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) throws NullPointerException, ClassCastException {
		if ( c == null )
			throw new NullPointerException();
		for (Object elem : c) {
			if ( !contains(elem) )
				return false;
		}
		return true;
	}

	@Override
	public boolean isEmpty() {
		return (dataCounter == 0);
	}

	@Override
	public boolean remove(Object o) { // Removes the first occurrence
		int index = indexOf(o);
		if ( index < 0 )
			return false;
		if (remove(index) == null) {
			return false;
		}
		return true;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		boolean result = false;
		for (Object object : c) {
			if (remove(object)) {
				result = true;
			}
		}
		return result;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		boolean result = false;
		for (T elem : data) {
			if ( !c.contains(elem) ) {
				if (remove(elem)) {
					result = true;
				}
			}
		}
		return result;
	}

	@Override
	public Object[] toArray() {
		return Arrays.copyOf(data, dataCounter);
	}

	@Override
	public <T> T[] toArray(T[] a) throws NullPointerException, IndexOutOfBoundsException {
		if ( a == null )
			throw new NullPointerException();
		if ( a.length < dataCounter ) {
			return (T[]) Arrays.copyOf(data, a.length);
		}
		System.arraycopy(data, 0, a, 0, dataCounter);
		for (int i = dataCounter; i < a.length; i++) {
			a[i] = null;
		}
		return a;
	}

	@Override
	public void add(int index, T element) throws IllegalArgumentException,
		IndexOutOfBoundsException {
		if ( index < 0 )
			throw new IllegalArgumentException();
		if ( index >= capacity )
			throw new IndexOutOfBoundsException();
		if ( dataCounter >= capacity ) {
			increaseCapacity(1);
		}
		System.arraycopy(data, index, data, index+1, dataCounter-index);
		data[index] = element;
		dataCounter++;
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) throws IllegalArgumentException,
		IndexOutOfBoundsException, NullPointerException {
		if ( c == null )
			throw new NullPointerException();
		if ( index < 0 )
			throw new IllegalArgumentException();
		if ( capacity+c.size() >= capacity ) {
			increaseCapacity(c.size());
			//throw new IndexOutOfBoundsException();
		}
		T[] old = Arrays.copyOf(data, dataCounter);
		System.arraycopy(data, index, data, index+c.size(), dataCounter - index);
		System.arraycopy(c.toArray(), 0, data, index, c.size());
		dataCounter += c.size();
		return !old.equals(data);
	}

	@Override
	public T get(int index) throws IllegalArgumentException, NoSuchElementException {
		if ( index < 0  )
			throw new IllegalArgumentException();
		if ( index >= dataCounter )
			throw new NoSuchElementException();
		return data[index];
	}

	@Override
	public int indexOf(Object o) {
		if (o != null) {
			for (int i = 0; i < dataCounter; i++) {
				if ( o.equals(data[i]) )
					return i;
			}
		}
		else {
			for (int i = 0; i < dataCounter; i++) {
				if ( data[i] == null )
					return i;
			}
		}
		return -1;
	}

	@Override
	public int lastIndexOf(Object o) {
		int j = -1;
		if (o != null) {
			for (int i = 0; i < dataCounter; i++) {
				if ( o.equals(data[i]) )
					j = i;
			}
		}
		else {
			for (int i = 0; i < dataCounter; i++) {
				if ( data[i] == null )
					j = i;
			}
		}
		return j;
	}

	@Override
	public ListIterator<T> listIterator() {
		return new MyStackListIterator(0);
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		return new MyStackListIterator(index);
	}

	@Override
	public T remove(int index) {
		if ( index < 0 )
			throw new IllegalArgumentException();
		if ( index > dataCounter )
			throw new IndexOutOfBoundsException();
		T old = data[index]; // save old to return
		System.arraycopy(data, index+1, data, index, dataCounter-(index+1));
		data[--dataCounter] = null;
		return old;
	}

	@Override
	public T set(int index, T element) throws IllegalArgumentException,
	NoSuchElementException {
		if ( index < 0 )
			throw new IllegalArgumentException();
		if ( index > dataCounter )
			throw new NoSuchElementException();
		data[index] = element;
		return element;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		// not implement : too hard
		return null;
	}
}
