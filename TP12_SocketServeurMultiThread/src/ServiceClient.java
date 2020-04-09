
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.*;

// ATTENTION DOIT AUSSI HERITER DE THREAD
public class ServiceClient extends Thread{

	private int numero;
	private Socket client;

	public ServiceClient(Socket client, int numero) {
		super();
		this.client = client;
		this.numero = numero;
	}

	@Override
	public void run() {
		//generer les entre sortie
		try {
			InputStream inputStream = client.getInputStream();
			// lecture d'une chaine de caracterer ==> bufferedReader
			// ATTENTION PREND EN PARAMETRE UN InputStreamReader ET NON UN OCTET (inputStream)
			@SuppressWarnings("resource")
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			// envoi chaine de caratere
			OutputStream outputStream = client.getOutputStream();
			// ecriture du resultat
			PrintWriter printWriter = new PrintWriter(outputStream,true);
			// envoie message au serveur
			System.out.println("Connexion du client numero : "+ numero);
			// envoie message au client
			printWriter.println("Vous êtes le clients numero : " + numero);
			System.out.println("Connexion du client numero : " + numero);
			// Le serveur MultiThread attend la requete du client
			while(true) {
				String request = bufferedReader.readLine();
				//renvoie le nombre de caractere
				printWriter.println(request.length());

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
