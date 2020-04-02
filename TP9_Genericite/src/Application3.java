
public abstract class Application3 {

	// Utilisation de la classe generic Calcul
	public static void main(String[] args) {
		Calcul<String> calcul = new Calcul<>();
		double a = 8.9;
		double b = 9.5;
		System.out.println(calcul.comparer(a, b));

		String x="azerty";
		String y="azerty";
		
		System.out.println(calcul.comparer(x, y));
	
		Produit produit1 = new Produit();
		Produit produit2 = new Produit();
		System.out.println(calcul.comparer(produit1, produit2));
	}

}
