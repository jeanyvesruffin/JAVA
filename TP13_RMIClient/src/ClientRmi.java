
import java.rmi.Naming;
import java.util.List;

import rmi.Compte;
import rmi.IBanqueRemote;

public class ClientRmi {

	
	// a besoin de l'interface et des classes du package rmi TP13_RMIServeur
	// dans un premier temps on les copie/ colle 
	// Sinon on genere un .jar à l'aide d'eclipse ---> export / java / JAR file selectionne les fichier utile
	// que l'on enregistre ex client.jar
	// puis on l'importe a l'aide du class path -- library extern jar
	
	public static void main(String[] args) {
		// on donne l'annuaire et il nous retourne les references ===>"rmi://loacalhost:1099/BANQUE"
		try {
			IBanqueRemote stub = (IBanqueRemote) Naming.lookup("rmi://localhost:1099/BANQUE");
			// on appel la methode distante
			System.out.println(stub.conversion(90));
			System.out.println(stub.test());
			// on recupere le compte
			// recu l'objet on doit le edeserializer
			Compte compte = stub.consulter(9);
			System.out.println("Code : "+compte.getCode());
			System.out.println("Solde : "+compte.getSolde());
			// recupere enfin la liste des comptes
			List<Compte> listComptes = stub.listComptes();
			for(Compte cpt : listComptes) {
				System.out.println("Solde : "+cpt.getSolde());				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
