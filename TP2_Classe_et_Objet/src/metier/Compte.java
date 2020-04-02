package metier;

public class Compte {
	// Declaration variables
	private int code;
	private float solde;
	
	// Constructeur
	public Compte(int code, float solde) {
		super();
		this.code = code;
		this.solde = solde;
	}

	// Methodes
	public void verser(float montant) {
		solde += montant;
	}
	public void retirer(float montant) {
		solde -= montant;
	}
	public String toString() {
		return ("Code :"+code+" Solde :"+solde);
		
	}
	
	// Getter & Setter
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}
	
}
