import java.util.Date;


// utilisation de la classe generic Coupole au travers de Triplet via l'heritage
public class Application2 {

	public static void main(String[] args) {
		Triplet<String, Double> objet = new Triplet<String, Double>("A", "B", 7.3);
		System.out.println(objet.getA());
		System.out.println(objet.getB());
		System.out.println(objet.getC());
		
		Triplet<Date, Float> objet2 = new Triplet<Date, Float>(new Date(), new Date(), (float)7);
		System.out.println(objet2.getA());
		System.out.println(objet2.getB());
		System.out.println(objet2.getC());
	}

}
