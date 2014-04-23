package lesson140401.localInner;

public class UseH {

	public static void main(String[] args) {
		H h = new H();
		h.changeState();
		System.out.println(h.state);
		
		G g = new G();
		g.changeState();
		g.changeState();
		System.out.println(g.state);
	}
	
}
