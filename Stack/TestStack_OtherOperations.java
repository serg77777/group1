package homework.stack;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;

import org.junit.Test;

/*
 * Lukashina N.B.
 * 
 * This test case checks stack methods for intarfaces Collection<T>, List<T>
 */

public class TestStack_OtherOperations {

	@Test
	public void testAddT() {
		MyStack<String> stack = new MyStack<>(2);
		stack.add("a");
		stack.add("b");
		stack.add("c");
		
		assertEquals("a", stack.get(0));
		assertEquals("b", stack.get(1));
		assertEquals("c", stack.get(2));
	}
	
	@Test
	public void testAddAllCollectionOfQextends() {
		MyStack<String> stack = new MyStack<>(5);
		stack.add("a");
		stack.add("b");
		stack.add("c");
		
		List<String> lst = new ArrayList<String>(3);
		lst.add("d");
		lst.add("e");
		lst.add("f");
		stack.addAll(lst);
		
		assertEquals(3, stack.lastIndexOf("d"));
	}

	@Test( expected = NoSuchElementException.class )
	public void testClear() {
		MyStack<String> stack = new MyStack<>(3);
		stack.add("a");
		stack.add("b");
		stack.add("c");
		
		stack.clear();
		assertTrue(stack.empty());
		
		stack.get(0);
	}

	@Test
	public void testContains() {
		MyStack<String> stack = new MyStack<>(3);
		stack.add("a");
		stack.add("b");
		stack.add("c");
		
		assertTrue(stack.contains("a"));
		assertFalse(stack.contains("d"));
	}

	@Test
	public void testContainsAll() {
		MyStack<String> stack = new MyStack<>(3);
		stack.add("a");
		stack.add("b");
		stack.add("c");
		
		List<String> lst = new ArrayList<String>(3);
		lst.add("a");
		lst.add("b");
		
		assertTrue(stack.containsAll(lst));
		lst.add("d");
		assertFalse(stack.containsAll(lst));
	}

	@Test
	public void testIsEmpty() {
		MyStack<String> stack = new MyStack<>(3);
		assertTrue(stack.isEmpty());
		stack.add("a");
		assertFalse(stack.isEmpty());
	}

	@Test
	public void testRemoveObject() {
		MyStack<String> stack = new MyStack<>(3);
		stack.add("a");
		stack.add("b");
		stack.add("c");
		
		stack.remove("a");
		assertFalse(stack.contains("a"));
		assertEquals(2, stack.size());
		assertEquals(-1, stack.lastIndexOf("a"));
		assertFalse(stack.remove("d"));
	}

	@Test
	public void testRemoveAll() {
		MyStack<String> stack = new MyStack<>(3);
		stack.add("a");
		stack.add("b");
		stack.add("c");
		
		List<String> lst = new ArrayList<>(2);
		lst.add("a");
		lst.add("b");
		assertTrue(stack.removeAll(lst));
		assertFalse(stack.contains("a"));
		assertFalse(stack.contains("b"));
		assertTrue(stack.contains("c"));
		
		List<String> lst2 = new ArrayList<>(2);
		lst2.add("d");
		lst.add("e");
		assertFalse(stack.removeAll(lst2));
	}

	@Test
	public void testRetainAll() {
		MyStack<String> stack = new MyStack<>(3);
		stack.add("a");
		stack.add("b");
		stack.add("c");
		
		List<String> lst = new ArrayList<>(2);
		lst.add("a");
		lst.add("b");
		assertTrue(stack.retainAll(lst));
		assertTrue(stack.contains("a"));
		assertTrue(stack.contains("b"));
		assertFalse(stack.contains("c"));
		assertFalse(stack.retainAll(lst));
	}

	@Test
	public void testToArray() {
		MyStack<String> stack = new MyStack<>(3);
		stack.add("a");
		stack.add("b");
		stack.add("c");
		
		Object[] array = stack.toArray();
		for (Object object : array) {
			assertTrue(stack.contains(object));
		}
		assertTrue(stack.size() == array.length);
	}

	@Test
	public void testToArrayTArray() {
		MyStack<String> stack = new MyStack<>(3);
		stack.add("a");
		stack.add("b");
		stack.add("c");
		
		String[] array = {"a", "b"};
		Object[] result = stack.toArray(array);
		for (Object object : result) {
			assertTrue(stack.contains(object));
		}
		assertTrue(result.length == (stack.size() - 1));
	}

	@Test
	public void testAddIntT() {
		MyStack<String> stack = new MyStack<>(4);
		stack.add("a");
		stack.add("b");
		stack.add("c");
		
		stack.add(1, "d");
		stack.add(3, "f");
		assertEquals("d", stack.get(1));
		assertEquals("b", stack.get(2));
		assertEquals("f", stack.get(3));
		assertTrue(stack.size() == 5);
	}

	@Test
	public void testAddAllIntCollectionOfQextendsT() {
		MyStack<String> stack = new MyStack<>(5);
		stack.add("a");
		stack.add("b");
		stack.add("c");
		
		List<String> lst = new ArrayList<String>(3);
		lst.add("d");
		lst.add("e");
		lst.add("f");
		assertTrue(stack.addAll(1, lst));
		
		assertEquals("d", stack.get(1));
		assertEquals("e", stack.get(2));
		assertEquals("f", stack.get(3));
		assertEquals("b", stack.get(4));
		assertTrue(stack.size() == 6);
	}

	@Test( expected = IllegalArgumentException.class )
	public void testGet() {
		MyStack<String> stack = new MyStack<>(1);
		stack.add("a");
		
		assertEquals("a", stack.get(0));
		stack.get(-1);
	}
	@Test( expected = NoSuchElementException.class )
	public void testGet2() {
		MyStack<String> stack = new MyStack<>(1);
		stack.add("a");

		stack.get(3);
	}

	@Test
	public void testIndexOf() {
		MyStack<String> stack = new MyStack<>(5);
		stack.add("a");
		stack.add("b");
		stack.add("b");
		stack.add("c");
		
		assertEquals(1, stack.indexOf("b"));
		assertEquals(-1, stack.indexOf("d"));
	}

	@Test
	public void testLastIndexOf() {
		MyStack<String> stack = new MyStack<>(10);
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		stack.push("a");
		stack.push("e");
		stack.push("f");
		
		assertEquals(4, stack.lastIndexOf("a"));
		assertEquals(1, stack.lastIndexOf("b"));
		assertEquals(-1, stack.lastIndexOf("g"));
	}

	@Test
	public void testListIterator() {
		MyStack<String> stack = new MyStack<>(4);
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		
		ListIterator<String> it = stack.listIterator();
		assertEquals("a", it.next());
		assertEquals("a", it.previous());
	}

	@Test
	public void testListIteratorInt() {
		MyStack<String> stack = new MyStack<>(4);
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		
		ListIterator<String> it2 = stack.listIterator(2);
		assertEquals("c", it2.next());
		it2.previous();
		assertEquals(3, it2.nextIndex());
		assertEquals(2, it2.previousIndex());
	}

	@Test
	public void testRemoveInt() {
		MyStack<String> stack = new MyStack<>(4);
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		
		assertTrue(stack.remove(1).equals("b"));
		assertFalse(stack.contains("b"));
	}

	@Test
	public void testSet() {
		MyStack<String> stack = new MyStack<>(4);
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		
		stack.set(2, "d");
		assertEquals("d", stack.get(2));
		assertFalse(stack.contains("c"));
	}

}
