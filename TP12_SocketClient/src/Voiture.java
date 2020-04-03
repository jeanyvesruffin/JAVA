import java.io.Serializable;

public class Voiture implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String mat;
	int carburant;
	public Voiture(String mat, int carburant) {
		super();
		this.mat = mat;
		this.carburant = carburant;
	}

}
