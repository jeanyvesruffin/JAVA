
public class Compte {
	private int code;
	private float solde;
	public Compte(int code, float solde) {
		super();
		this.code = code;
		this.solde = solde;
	}
	public void verser (float mt) {
		solde += mt;
	}
	public void retirer (float mt) throws SoldeInsuffisantException, NegativeException {
		// " creation d'une exception"
		if (mt>solde) {
			// exception dite surveill�
			throw new SoldeInsuffisantException("Solde insuffisant !!");
		}
		if (mt<0) {
			// exception dite surveill�
			throw new NegativeException("Montant n�gatif !!");
		}
		solde -= mt;
	}
	public float getSolde() {
		return solde;
	}
	public int getCode() {
		return code;
	}
	

}
