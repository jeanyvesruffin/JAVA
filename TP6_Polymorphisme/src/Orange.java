
public class Orange extends Fruit {

	public Orange (int p) {
		poids=p;
		System.out.println("Creation d'une orange poids :"+poids+" grammes ");
	}
	
	// redefinition de la methode afficher
	@Override
	public void afficher() {
		System.out.println("C'est une orange");
	}
	public void affichePoids() {
		System.out.println("Le poids de l'orange est "+poids);
	}
	
}
