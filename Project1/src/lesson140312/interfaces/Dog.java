package lesson140312.interfaces;

public class Dog implements Comparable<Dog>{

	private String name;
	private int speed;
	private int height;
	private int furQuality;
	
	
	public Dog(String name, int speed, int height, int furQuality) {
		super();
		this.setName(name);
		this.setSpeed(speed);
		this.setHeight(height);
		this.setFurQuality(furQuality);
	}


	@Override
	public int compareTo(Dog o) {
		
		if (this.speed > o.getSpeed()) {
			return -1;
		} 
		if (this.speed < o.getSpeed()) {
			return 1;
		}		
		if (this.speed > o.getHeight()) {
			return -1;
		} 
		if (this.speed < o.getHeight()) {
			return 1;
		}		
		if (this.speed > o.getFurQuality()) {
			return -1;
		} 
		if (this.speed < o.getFurQuality()) {
			return 1;
		}
		
		return 0;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getFurQuality() {
		return furQuality;
	}
	public void setFurQuality(int furQuality) {
		this.furQuality = furQuality;
	}

}
