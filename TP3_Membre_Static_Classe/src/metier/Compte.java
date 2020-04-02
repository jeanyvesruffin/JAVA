package metier;

public class Compte {
	//Declaration variables
	private int code;
	private float solde;
	private static int nbComptes = 0;
	
	public Compte(float soldeCompte) {
		++nbComptes;
		code = nbComptes;
		solde =  soldeCompte;
	}
	
	public void verser (float montant) {
		solde += montant;
	}
	
	public void retirer (float montant) {
		solde -= montant;
	}
	
	public String toString () {
		return(("Code :"+code+" Solde :"+solde));
	}

	
	//getter && setter
	public int getCode() {
		return code;
	}
	
	public float getSolde() {
		return solde;
	}
	
	public static int getNbComptes() {
		return nbComptes;
	}
	
	
}
