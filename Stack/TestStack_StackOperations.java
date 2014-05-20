package homework.stack;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;

import org.junit.Test;

/*
 * Lukashina N.B.
 * 
 * This test case checks special stack methods: class constructor, push, pop, peek, search
 * Also it checks simple methods like size() and methods of Iterable<T> interface: iterator(), itrator.next(), iterator.remove()
 */

public class TestStack_StackOperations {

	@Test(expected = IllegalArgumentException.class)
	public void testStackNegativeCapacity() {
		MyStack<Integer> stack = new MyStack<>(-1);
	}
	
	@Test
	public void testSize() {
		MyStack<Integer> stack = new MyStack<>(1);
		assertEquals(0, stack.size());
		
		stack.push(5);
		assertEquals(1, stack.size());
	}

	@Test
	public void testEmpty() {
		MyStack<Integer> stack = new MyStack<>(1);
		assertTrue(stack.empty());
	}

	@Test
	public void testPeek() {
		MyStack<String> stack = new MyStack<>(3);
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		assertEquals("c", stack.peek());
	}

	@Test
	public void testPop() {
		MyStack<String> stack = new MyStack<>(3);
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		assertEquals("c", stack.pop());
		assertEquals(2, stack.size());
	}

	@Test
	public void testPush() {
		MyStack<String> stack = new MyStack<>(3);
		stack.push("a");
		stack.push("b");
		stack.push("c");
		assertEquals(3, stack.size());
	}
	
	@Test
	public void testPushOutOfRange() {
		MyStack<String> stack = new MyStack<>(3);
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		
		assertEquals(4, stack.size());
	}

	@Test
	public void testSearch() {
		
		MyStack<String> stack = new MyStack<>(5);
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("a");
		stack.push("c");
		
		assertEquals(2, stack.search("a"));
		
	}

	@Test
	public void testIterator() {
		MyStack<String> stack = new MyStack<>(3);
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		Iterator<String> it = stack.iterator();
		assertNotEquals(null, it);
		
		assertEquals("a", it.next());
	}
	
	@Test
	public void testIteratorNext() {
		MyStack<Integer> stack = new MyStack<>(3);
		stack.push(1);
		stack.push(2);
		
		Iterator<Integer> it = stack.iterator();
		assertEquals(1, (it.next()).intValue());
	}
	
	@Test(expected = NoSuchElementException.class)
	public void testIteratorNextNoSuchElement() {
		MyStack<Integer> stack = new MyStack<>(3);
		stack.push(1);
		stack.push(2);
		
		Iterator<Integer> it = stack.iterator();
		it.next();
		it.next();
		it.next();
	}
	
	@Test
	public void testIteratorRemove() {
		MyStack<Integer> stack = new MyStack<>(3);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		Iterator<Integer> it = stack.iterator();
		it.next();
		it.next();
		it.remove();
		assertEquals(3, it.next().intValue());
	}
}
