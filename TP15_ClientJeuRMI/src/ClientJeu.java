import java.util.Scanner;

import javax.naming.Context;
import javax.naming.InitialContext;

import jeu.IJeuRemote;

public class ClientJeu {

	public static void main(String[] args) {
		try {
			// on doit juste utiliser l'interface
			Context context = new InitialContext();
			// utilisation de l'ionterface
			IJeuRemote stub = (IJeuRemote) context.lookup("JH");
			// creation du scanner
			Scanner clavier = new Scanner(System.in);
			while(true) {
				System.out.println("Deviner : ");
				int nombreSaisi = clavier.nextInt();
				if (nombreSaisi == -1) {
					break;
				}
				String reponse = stub.jouer(nombreSaisi);
				System.out.println(reponse);
			}
			clavier.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// on doit de nouveau copier/ coller le fichier jndi.properties == > contient la config de l'annunaire
	// ou bien celui-ci est dans le .jar
}
