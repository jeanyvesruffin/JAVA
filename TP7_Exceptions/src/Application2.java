import java.util.InputMismatchException;
import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		try {
			Scanner clavier = new Scanner(System.in);
			System.out.println("Code : ");
			int code = clavier.nextInt();
			System.out.println("Solde : ");
			float solde = clavier.nextFloat();
			Compte compte = new Compte(code, solde);
			System.out.println("Montant à verser : ");
			float mt1 = clavier.nextFloat();
			compte.verser(mt1);
			System.out.println("Montant à retirer : ");
			float mt2 = clavier.nextFloat();
			// methode retirer peux lever une exception
			// 1er solution try / catch

			compte.retirer(mt2);
			System.out.println("Le solde est de :"+ compte.getSolde());
			clavier.close();
		} catch (SoldeInsuffisantException e) {
			System.out.println(e.getMessage());
		} catch (NegativeException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Probleme de saisie");
		} finally {
			// le boc finally pourrait etre utile pour deconnexion par exemple 
			// ou pour ajouter un comportement/ traitement apres le try
			System.out.println("Bloc finaly");
		}
		// 2eme solution add throws Exception ds la signature de la methode
		// compte.retirer(mt2);
	}
	// throws fait remonter l'exception à la methode du niveau superieur
	// ON DOIT catch POUR traiter le problème
}
