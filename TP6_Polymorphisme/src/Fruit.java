
public abstract class Fruit {

	// ATTENTION METHODE ABSTRAITE == DOIT ETRE DS UNE CLASSE ABSTRAITE
	
	protected int poids;
	public Fruit() {
		System.out.println("Creation d'un fruit");
	}
	public abstract void afficher();
	// avantage obligation de la redefinir
	public abstract void affichePoids();
	
}
