package dao;
import dao.IDao;

public class DaoImpl2  implements IDao{

	@Override
	public double getTemperature() {
		double temperature = 15;
		return temperature;
	}

}
