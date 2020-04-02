
// class generic parametre generic T
public class Couple<T> {

	private T a;
	private T b;
	
	// constructeur avec parametres
	public Couple(T a, T b) {
		super();
		this.a = a;
		this.b = b;
	}

	// getter & setter
	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public T getB() {
		return b;
	}

	public void setB(T b) {
		this.b = b;
	}
	
	
}
