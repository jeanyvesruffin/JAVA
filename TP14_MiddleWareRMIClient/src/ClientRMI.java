import java.rmi.Naming;
import java.util.List;

import metier.Compte;
import rmi.IBanqueRemote;

public class ClientRMI {

	public static void main(String[] args) {
		// Lookup pour rechercher la reference de l'annuaire
		try {
			IBanqueRemote stub = (IBanqueRemote) Naming.lookup("rmi://localhost:1099/BK");
			// appeler lers methode de l'objet distant
			System.out.println(stub.conversion(9000));
			System.out.println("Consultation d'un compte");
			Compte compte = stub.consulterCompte(1);
			System.out.println("Code : "+ compte.getCode());
			System.out.println("Solde : "+ compte.getSolde());
			System.out.println("Date : "+ compte.getDateCreation());
			System.out.println("Liste des comptes");
			List<Compte> comptes = stub.listComptes();
			for(Compte c :comptes) {
				System.out.println("===================");
				System.out.println("Code : "+ c.getCode());
				System.out.println("Solde : "+ c.getSolde());
				System.out.println("Date : "+ c.getDateCreation());	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
// methode d'ajout de l'interface remote + la classe Compte
// on les genere a l'aide du .jar export --> java -- > jarFile
// on le save par exemple dans le dossier du bureau on le decompresse
// fichier .jar puis on le copie/colle dans le client et enfin propriete librairy et add 
// au CLASSPATH
// Pour demarrer le client en ligne de commande une erreur survient car ne detect pas le class path
// Pour ce faire il faut faire (-cp pour class path) + ".;" ==> pour ajouter le chemin tous les autres chemin:
// java -cp .;../proxyClient.jar ClientRMI
// l'autre sollution pour gerer les .classPath et de l'ajouter dans les variables d'environnement des proprietes de 
// l'ordinateur on donne comme nom de variable d'environnement
// classpath
// et comme valeur le chemin ici
// .;D:\WORK\Eclipse\SandBox\JAVA\TP14_MiddleWareRMIClient\proxyClient.jar
// ultime facon avec un fichier .bat (client.bat) open --> with Editor
// Puis on execute le fichier .bat en ligne de commande à partir du chemin 
// D:\WORK\Eclipse\SandBox\JAVA\TP14_MiddleWareRMIClient\bin>
