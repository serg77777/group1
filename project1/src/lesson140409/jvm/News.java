package lesson140409.jvm;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class News {

	private static NewsMaker _newsMaker;

	public static void main(String[] args) {

		_newsMaker = new MrPresident();
		System.out.println("start");

		startNewsMakerChanger();

		while (true) {

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
				while (true){
					if(scanner.hasNext());{
						String line = scanner.nextLine();//проверяет наличие новой строки 
						
						try {
							Class newClass= Class.forName(line);
						if(!NewsMaker.class.isAssignableFrom(newClass)){
							System.out.println("Is not a newsmaker");
							continue;
						}
						try{
							_newsmaker = (NewsMaker) newClass
						} catch (InstantiationException e)
						e.printStackTrace();
				
						
						}
					}
					//теперь считываем из потока ввода (с консоли/клавиатуры)
					
					scanner.nextLine();
				}
				
			}
			
		}).start();
		
		
		
	}

	private static void waitForNews() {

		try {
			TimeUnit.SECONDS.sleep(10);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static String getNews() {

		_newsMaker.getFreshNews();
		return null;
	}

}
