package jeu;

import java.rmi.registry.LocateRegistry;

import javax.naming.Context;
import javax.naming.InitialContext;

public class ServeurRMI {

	public static void main(String[] args) {
		try {
			// demarre l'annuaire
			LocateRegistry.createRegistry(1099);
			// instancie le jeu
			JeuImpl jeuImpl = new JeuImpl();
			System.out.println(jeuImpl.toString());
			// publication dans l'annuaire soit à l'aide de Naming.rebind("rmi://localhost:1099/JH", jeuImpl) soit 
			// à l'aide de JNDI (permet de communiquer avec n'imorte quelles annuaires:
			// DNS, LDAP, RMI, CARBA autres ...
			// JNDI 1er etape creation d'un objet Context
			// on doit creer un fichier JNDI.properties (dossier src)
			// les propriete sont definie dans le jndi.properties
			Context context = new InitialContext();
			context.rebind("JH", jeuImpl);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
