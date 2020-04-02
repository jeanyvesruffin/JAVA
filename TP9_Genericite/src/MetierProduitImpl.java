import java.util.List;

// utilisation de l'interface generique
//Nous voyons ici comment impementer une mm interface mais avec des type different
//Voir en comparaison MetierFournisseurImpl
public class MetierProduitImpl implements IMetier<Produit, Long>{

	@Override
	public Produit save(Produit objet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Produit objet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
