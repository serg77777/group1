package lesson140320;

public class Amphiby extends Car implements SeaTransport{
	
	SeaTransport boat = new Boat();
	
	@Override
	public void sail(){
		boat.sail();
	}
}
