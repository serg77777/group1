package homework140407.myqueue;

public class UseMyQueue {

	public static void main(String[] args) {

		MyQueue testQueue = new MyQueue(5);
		String[] testData = {"first", "second", "third", "fourth", "fifth", "sixth" };
		
		try {
			System.out.println("Head of MyQueue is now " + testQueue.viewHead() + "; because current size is "+testQueue.size());
			testQueue.add(testData[0]);
			System.out.println("Element is added. Current size is "+testQueue.size() + " And current Queue head is " +testQueue.viewHead());
			testQueue.add(testData[1]);
			System.out.println("Element is added. Current size is "+testQueue.size() + " And current Queue head is " +testQueue.viewHead());
			testQueue.add(testData[2]);
			System.out.println("Element is added. Current size is "+testQueue.size() + " And current Queue head is " +testQueue.viewHead());
			testQueue.add(testData[3]);
			System.out.println("Element is added. Current size is "+testQueue.size() + " And current Queue head is " +testQueue.viewHead());
			testQueue.add(testData[4]);
			System.out.println("Element is added. Current size is "+testQueue.size() + " And current Queue head is " +testQueue.viewHead());
		} catch (MyQueueOverflowException e) {
			e.printStackTrace();
		}
		 
		try {
			testQueue.add(testData[5]);
		} catch (MyQueueOverflowException e) {
			System.out.println("OOPS sixth was not added. Overflow");
			e.printStackTrace();
		}
		
		try {
			System.out.println( "Removing Queue Head - "+testQueue.extractHead()+"; New size is "+testQueue.size() + "; And new head is " +testQueue.viewHead());
			System.out.println( "Removing Queue Head - "+testQueue.extractHead()+"; New size is "+testQueue.size() + "; And new head is " +testQueue.viewHead());
			System.out.println( "Removing Queue Head - "+testQueue.extractHead()+"; New size is "+testQueue.size() + "; And new head is " +testQueue.viewHead());
			System.out.println( "Removing Queue Head - "+testQueue.extractHead()+"; New size is "+testQueue.size() + "; And new head is " +testQueue.viewHead());
			System.out.println( "Removing Queue Head - "+testQueue.extractHead()+"; New size is "+testQueue.size() + "; And new head is " +testQueue.viewHead());
		} catch (MyQueueIsEmptyException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println( "Removing Queue Head - "+testQueue.extractHead()+"; New size is "+testQueue.size() + "; And new head is " +testQueue.viewHead());
		} catch (MyQueueIsEmptyException e) {
			System.out.println("And underflow exception! None hove left in a queue");
			e.printStackTrace();
		}
		

		
	}

}
