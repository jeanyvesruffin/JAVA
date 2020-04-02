import java.io.Serializable;

// afin de fct ds l'app 4 Produit doit etre implementé de la mm facon
// que la classe generic Traitement, cad , doit etre serializable  et cloneable
public class Produit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idProduit;
	private String nomProduit;
	private double prix;
	
	
	public Produit() {
		super();
	}
	public Produit(Long idProduit, String nomProduit, double prix) {
		super();
		this.idProduit = idProduit;
		this.nomProduit = nomProduit;
		this.prix = prix;
	}
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}

}
