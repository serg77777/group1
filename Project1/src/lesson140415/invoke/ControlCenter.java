package lesson140415.invoke;

import java.util.concurrent.TimeUnit;

public class ControlCenter implements CommandListener , Runnable{

	private String _command;
	private Dispatcher _dispatcher;
    
	public ControlCenter(Dispatcher dispatcher) {
		// TODO Auto-generated constructor stub
		_dispatcher = dispatcher;
	}

	@Override
	public void command(String command) {
		_command = command;

		
	}
	
	@Override
	public void run(){
		while(true){
			_dispatcher.command(_command);
			pause();
		}
		
	}
	
	
	private void pause(){
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
