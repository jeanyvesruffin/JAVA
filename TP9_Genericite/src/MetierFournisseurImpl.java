import java.util.List;


// Nous voyons ici comment impementer une mm interface mais avec des type different
// Voir en comparaison MetierProduitImpl
public class MetierFournisseurImpl implements IMetier<Fournisseur , String>{

	@Override
	public Fournisseur save(Fournisseur objet) {
		return null;
	}

	@Override
	public List<Fournisseur> getAll() {
		return null;
	}

	@Override
	public Fournisseur findOne(String id) {
		return null;
	}

	@Override
	public void update(Fournisseur objet) {
		
	}

	@Override
	public void delete(String id) {
		
	}

}
