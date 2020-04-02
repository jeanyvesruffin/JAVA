
public class Application4 {

	// utilisatio nde la classe generic traitement prenant en parametres Produit
	public static void main(String[] args) {
		Traitement<ProduitLiquide> traitement = new Traitement<>(new ProduitLiquide(), new ProduitLiquide());
		System.out.println(traitement.getA().getQuantite());
		System.out.println(traitement.getB().getQuantite());
	}

}
