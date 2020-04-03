
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
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
