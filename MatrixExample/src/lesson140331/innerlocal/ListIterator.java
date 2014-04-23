package lesson140331.innerlocal;

import java.util.Iterator;

import lesson140331.innerlocal.MyList.Node;

public class ListIterator implements SimpleList, Iterator{
		Node next ;
		
		// Выделить этот во внешнй класс
		
		public ListIterator(Node first) {
			next = first;
		}
		
		@Override
		public boolean hasNext() {
			return next != null;
		}
		
		@Override
		public Object next() {
			Object result = next.getData();
			next = next.getNext();
			return result;
		}
		
		@Override
		public void remove() {
		}

		@Override
		public Iterator iterator() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void add(String element) {
			// TODO Auto-generated method stub
			
		}

}
