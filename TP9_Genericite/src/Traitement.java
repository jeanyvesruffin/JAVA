import java.io.Serializable;

// class generic qui recoit un type T 
public class Traitement<T extends Produit & Serializable & Cloneable> {

	// cela signifie que la classe generic Traitement prend uniquement en parametre
	// un type T qui herite de Produit qui implemente serialisable cloneable ...ect
	// se dit appliquer des restriction
	private T a;
	private T b;
	
	public Traitement() {
		super();
	}
	
	public Traitement(T a, T b) {
		super();
		this.a = a;
		this.b = b;
	}
	
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
