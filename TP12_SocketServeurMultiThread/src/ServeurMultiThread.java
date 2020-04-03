import java.net.*;

public class ServeurMultiThread extends Thread{
	// 1er Lors de l'utilisation de Thread nous devons dans un 1er tps
	// Redefinir la methode run

	// s'incremente a chaque fois qu'un client se connexte
	private int nbrClients =0;

	@Override
	public void run() {
		// 3eme creation de serveur Socket
		try {
			@SuppressWarnings("resource")
			ServerSocket serverSocket = new ServerSocket(456);
			while(true) {
				// boucle infinie
				// declaration d'une socket
				// PERMET LA CONNEXION AVEC LE CLIENT
				Socket socket = serverSocket.accept();
				// declaration de la classe de traitement ServiceClient
				// on donne comme parametre une socket de connexion 
				// + le nombre de client ==> Permet l'identification du client Id_client
				nbrClients++;
				new ServiceClient(socket, nbrClients).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// 2eme Executer la methode start 
		new ServeurMultiThread().start();
		// Pour faire nos tests nous utiliserons telnet
		// telnet adresse ip numero de port
		// on "ping" == > telnet localhost 345
		//Ouvrir plusieur cmd en executant la cmc telnet pour verifier le multiThread


	}

	// Les traitement de communication se font dans une class a par exemple ServiceClient

}
