
public class Pomme extends Fruit {

	public Pomme (int p) {
		poids=p;
		System.out.println("Creation d'une pomme poids :"+poids+" grammes ");
	}
	
	// redefinition de la methode afficher
	@Override
	public void afficher() {
		System.out.println("C'est une pomme");
	}
	public void affichePoids() {
		System.out.println("Le poids de la pomme est "+poids);
	}
	
}
