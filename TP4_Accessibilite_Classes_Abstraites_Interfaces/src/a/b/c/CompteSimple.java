package a.b.c;

// L'acces au variable constante (final) sont optimisé en memoire pour un acces plus rapide
// et plus sure. Idem pour les classes


// class final on peux l'instancier mais pas la redefinir 
public final class CompteSimple extends Compte{
	private float decouvert;

	// private final float taux = 2;
	public CompteSimple(int code, float solde, float decouvert) {
		super(code, solde);
		this.decouvert = decouvert;
	}

	//override ==> redefinition de la methode retirer herite de compte
	@Override
	public void retirer(float montant) {

		if(montant < solde+decouvert) {
			solde -= montant;
		}
	}

	@Override
	public void afficher() {
		System.out.println("C'est un compte simple");
	}

}
