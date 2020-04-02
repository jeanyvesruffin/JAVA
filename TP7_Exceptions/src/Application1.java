import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		//Scanner permet de lire la saisi faite sur le clavier
		// System.in correspondant au clavier
		Scanner clavier = new Scanner(System.in);
		System.out.println("A :");
		int a = clavier.nextInt();
		System.out.println("B :");
		int b = clavier.nextInt();
		// calculer le resultat c = a/b puis on affiche
		int c = 0;
		try {
			c = a/b;
			//lève l'exception  java.lang.ArithmeticException: / by zero et l'app bug s'arrete
		} catch (ArithmeticException e) {
			// un simple message d'alerte "Division par zéro"
			// System.out.println("Division par zéro");
			// un message retournant le message de l'exception "/ by zero"
			// System.out.println(e.getMessage());
			// un message retournant le type d'exception ainsi que le message "java.lang.ArithmeticException: / by zero"
			// System.out.println(e.toString());
			// pour avoir le detail de l'exception savoir on il c'est produite
			// "java.lang.ArithmeticException: / by zero"
			//"at Application1.main(Application1.java:16)"
			// cette exception est ecrtit dans un log
			e.printStackTrace();


		}
		System.out.println("C ="+c);
		clavier.close();
	}

}
