package metier;

public class Application {

	public static void main(String[] args) {
		Compte c1 = new Compte (1, 5000);
		c1.verser(6000);
		c1.retirer(8000);
		System.out.println(c1.toString());
	}

}
