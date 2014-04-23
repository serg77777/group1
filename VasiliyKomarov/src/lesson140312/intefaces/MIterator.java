package lesson140312.intefaces;

import java.util.Iterator;


import lesson140312.intefaces.MyList.Node;


public class MIterator implements Iterator {

	
	     
		
			private  Node nextElement;
			{
			
			
			}
			public MIterator(Node first) {
				
				nextElement = first;
				
			}
			public boolean hasNext() {
				return nextElement != null;
			}
			public Object next() {
				Object data = nextElement.data;
				nextElement = nextElement.next;
				return data;
			}
			
			public void remove() {
				
			}
			
		
	}
	


