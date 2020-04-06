package dao;

public class DaoImpl implements IDao{

	@Override
	public double getTemperature() {
		// la valeur proviendrait d'un base de données
		double temperature = 24; 
		return temperature * 7;
	}

}
