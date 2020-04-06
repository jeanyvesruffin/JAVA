package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
	// dit couplage faible
	private IDao dao;
	
	@Override
	public double calcul() {
		double temperature = dao.getTemperature();
		return temperature;
	}

	public void setDao(IDao dao) {
		this.dao = dao;
	}

}
