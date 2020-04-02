// classe derivé
public class ProduitLiquide extends Produit implements Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int quantite;

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
}
