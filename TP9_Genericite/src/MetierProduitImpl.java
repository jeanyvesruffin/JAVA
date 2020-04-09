import java.util.List;

// utilisation de l'interface generique
//Nous voyons ici comment impementer une mm interface mais avec des type different
//Voir en comparaison MetierFournisseurImpl
public class MetierProduitImpl implements IMetier<Produit, Long>{

	@Override
	public Produit save(Produit objet) {
		return null;
	}

	@Override
	public List<Produit> getAll() {
		return null;
	}

	@Override
	public Produit findOne(Long id) {
		return null;
	}

	@Override
	public void update(Produit objet) {
		
	}

	@Override
	public void delete(Long id) {
		
	}

}
