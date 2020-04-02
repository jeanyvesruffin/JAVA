import java.util.Date;


// utilisation de la classe generic Couple
public class Application {

	public static void main(String[] args) {
		Couple<Integer> couple1 = new Couple<Integer>(3, 5);
		Couple<Date> couple2 = new Couple<Date>(new Date(),new Date());
		System.out.println(couple1.getA());
		System.out.println(couple2.getA());
		System.out.println(couple1.getB());
		System.out.println(couple2.getB());

	}

}
