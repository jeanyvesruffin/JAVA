package dao;

public class DaoImpl implements IDao{

	@Override
	public double getTemperature() {
		// la valeur proviendrait d'un base de donn�es
		double temperature = 24; 
		return temperature * 7;
	}

}
