import java.rmi.Naming;
import java.util.List;

import rmi.Compte;
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
			System.out.println("Solde : "+ compte.getCode());
			System.out.println("Date : "+ compte.getDateCreation());
			System.out.println("Liste des comptes");
			List<Compte> comptes = stub.listComptes();
			for(Compte c :comptes) {
				System.out.println("===================");
				System.out.println("Code : "+ c.getCode());
				System.out.println("Solde : "+ c.getCode());
				System.out.println("Date : "+ c.getDateCreation());	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
