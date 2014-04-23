package lesson140401.localinner;

public class G  implements ImplementorOfI{
	int state = 30;
	
	public I getImplementationOfI(){
		return new I(){

			@Override
			public void doIt() {
				// TODO Auto-generated method stub
				System.out.println("did it anon "+ state);
			}
			
		};
	}
}
