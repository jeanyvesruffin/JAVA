import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.*;

public class Serveur {
	// Le syst�me des sockets est le moyen de communication interprocessus d�velopp� pour l'Unix Berkeley (BSD).
	// Il est actuellement impl�ment� sur tous les syst�mes d'exploitation utilisant TCP/IP. Une socket est le point de communication 
	// par lequel un thread peut �mettre ou recevoir des informations et ainsi elle permet la communication entre deux applications � 
	// travers le r�seau. La communication se fait sur un port particulier de la machine. Le port est une entit� logique qui permet 
	// d'associer un service particulier � une connexion. Un port est identifi� par un entier de 1 � 65535. Par convention les 1024 
	// premiers sont r�serv�s pour des services standard (80 : HTTP, 21 : FTP, 25: SMTP, ...) Java prend en charge deux protocoles : TCP et UDP.
	// Les classes et interfaces utiles au d�veloppement r�seau sont regroup�es dans le package java.net.
	public static void main(String[] args) {
		// prend en parametre le numero de port ex:234
		try {
			ServerSocket serverSocket = new ServerSocket(234);
			System.out.println("J'attend une connexion");
			// Declaration d'une socket
			Socket socket = serverSocket.accept();
			// on declare input et output qui seront les objets entrant et sortants
			// se dis STEAM DE COMMUNICATION
			// ATTENTION Steam = echange des octets
			// ATENTION SI result > 255 CA BUG
			// � la difference inputStreamReader et bufferedStream permettra de lire un caractere (32 bits soit 4 octet)
			// se dis STREAM DE TRAITEMENT
			InputStream inputStream = socket.getInputStream();
			OutputStream outputStream = socket.getOutputStream();
			// attendre l'ordre emis par l'utilisateur
			System.out.println("J'attend un nombre");
			int nombre = inputStream.read();
			// traitement
			int response = nombre*3;
			// envoie de la reponse
			outputStream.write(response);
			// on deconnecte au besoinle socket
			// socket.close();
			// on execute l'application � l'aide de lignes de commandes
			// 1er le fichier serveur.java
			// aller ds propriete du projet serveur copier la location
			// ouvrir cmd du projet serveur dans bin
			// java Serveur
			// ==> retour j'attend une connexion
			// passe ensuite sur le client
			// EXEMPLE D'ENVOI D'OBJET VERS LE CLIENT
			// SERIALISATION
			// ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
			// Voiture voiture1 = new Voiture("V212", 50);
			// objectOutputStream.writeObject(voiture1);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
