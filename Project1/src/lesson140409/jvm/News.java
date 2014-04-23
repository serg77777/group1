package lesson140409.jvm;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class News {

	private static NewsMaker _newsMaker;

	public static void main(String[] args) {
		
		_newsMaker = new MrPresident();
		
		System.out.println("start");
		
		startNewsMakerChanger();
		
		while(true){
			
			waitForNews();
			
			String news = _newsMaker.getFreshNews();
			
			System.out.println(news);
		
		}
		
	}

	private static void startNewsMakerChanger() {

		new Thread(new Runnable(){

			@Override
			public void run() {
				
				Scanner scanner = new Scanner(System.in);
				
				while(true){
					if(scanner.hasNext()){
						String newClass = scanner.nextLine();
						Class c;
						try {
							c = Class.forName("lesson140409.jvm."+newClass);
							if(!NewsMaker.class.isAssignableFrom(c)){
								System.out.println("'"+newClass+"' is not newsmaker.");
								continue;
							}
							_newsMaker = (NewsMaker) c.newInstance();
						} catch (ClassNotFoundException e) {
						
							e.printStackTrace();
						} catch (InstantiationException e) {
							
							e.printStackTrace();
						} catch (IllegalAccessException e) {
							
							e.printStackTrace();
						}
						finally{
							continue;
						}
					}
				}
				
			}
			
		}).start();
	}

	private static void waitForNews() {
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
