
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// etablir une connection avec la socket
		// doit specifier 2 parametres l'adresse ip (ex:localhost)
		// et le numero de port (idem que le serveur 234)
		try {
			Socket socket = new Socket("localhost",234);
			// on declare input et output qui seront les objets entrant et sortants
			// se dis STEAM DE COMMUNICATION
			// ATTENTION Steam = echange des octets
			// ATENTION SI result > 255 CA BUG
			// à la difference outputStream et PrintWriter permettront d'envoyé une chaine de caracteres
			// se dis STREAM DE TRAITEMENT
			InputStream inputStream = socket.getInputStream();
			OutputStream outputStream = socket.getOutputStream();

			// demander au client de sair un nombre
			Scanner clavier = new Scanner(System.in);
			System.out.println("Donner un nombre");
			int nombre = clavier.nextInt();

			// on envoi la saisi a la socket
			outputStream.write(nombre);
			// on attend la reponse
			int reponse = inputStream.read();
			// on affiche la reponse
			System.out.println("Reponse"+ reponse);
			// on execute l'application à l'aide de lignes de commandes
			// 1er le fichier serveur.java
			// puis idem que precedemment mais pour le client
			// cd bin puis java client
			// nous pouvons remarquer que le serveur nous indique 
			// j'attend une connexion ==> ok
			// j'attend un nombre ==> server en attente
			// A la fin de l'execution Server se ferme et client 
			// retour le resultat (ex: 15 pour une sais= 5) puis se ferme egalement
			// EXEMPLE DE RECEPTION ET LECTURE D'OBJET
			// DESERIALISATION
			// ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
			// Voiture voiture1 = (Voiture)objectInputStream.readObject();
			socket.close();
			clavier.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
