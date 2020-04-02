package a.b.c;

// classe Compte abstract
// Une classe abstraite ne peut pas etre instancier
// Generalement une classe abstraire possede des attribut PROTECTED
//Protected permet au attribut d'etre visible ds la classe ainsi que ds celle herite

//Implementation peut etre abstract et implemente qqchose dans ce cas ns n'avons pas besoin de redefinir les methodes
public abstract class Compte implements ICompte{
	private int code;
	protected float solde;
	public Compte(int code, float solde) {
		super();
		this.code = code;
		this.solde = solde;
	}
	public Compte() {
		super();
	}

	// methode abstraite uniquement la signature de la methode
	// cette methode devra etre redefini dans les classes filles
	public abstract void afficher();

	// final ns empeche de redefinir une methode
	public final void verser (float montant) {
		solde += montant;
	}
	public void retirer (float montant) {
		solde -= montant;
	}
	public float getSolde() {
		return solde;
	}
	public String toString() {
		return "Code :"+code+" Solde :"+solde;
	}

}
