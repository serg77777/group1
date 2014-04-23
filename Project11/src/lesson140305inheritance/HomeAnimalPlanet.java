package lesson140305inheritance;

public abstract class HomeAnimalPlanet extends AnimalPlanet {
	abstract public void brush();

	@Override
	protected void go() {
		System.out.println("walking dead; walk eto wolf");
	}
}
