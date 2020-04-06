package presentation;

import java.io.File;
import java.util.Scanner;

import dao.IDao;

//import dao.DaoImpl;
//import metier.MetierImpl;

public class Presentation {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// IL FAUT FAIRE DE L'INJECTION DE DEPENDANCE
		// ===>  dit injection par instanciation static
		// sinon System.out.println(metierImpl.calcul());
		// Return Exception in thread "main" java.lang.NullPointerException
		// NEW === COUPLAGE FORT !!!
		// NEW === COUPLAGE FORT !!!
		// NEW === COUPLAGE FORT !!!
		// DANGEREUX POUR LA MAINTENANCE !!!
		// DaoImpl daoImpl = new DaoImpl();

		// creer un metier
		//MetierImpl metierImpl = new MetierImpl();
		// on associe une valeur 
		//metierImpl.setDao(daoImpl);
		// puis on affiche le resultat
		//System.out.println(metierImpl.calcul());
		// autre solution d'injection de dependance

		///// on charge dynamiquement les classes en memoire ==> Driver
		// ===> dit injection par instanciation dynamique
		// on creer un fichier de configuration config.txt
		// on lit le fichier
		try {
			Scanner scanner = new Scanner(new File("config.txt"));
			//lecture de la premier ligne du fichier
			String daoClassName = scanner.next();
			// System.out.println(daoClassName);
			// daoClassName = "dao.DaoImpl"
			// lecture de la deuxieme
			String metierClassName = scanner.next();
			// System.out.println(metierClassName);
			// metierClassName ="metier.MetierImpl"
			// charger la class dynamiquement en memoire
			Class cDao = Class.forName(daoClassName);
			// on instancie cDaoa à l'aide de la methode newInstance qui equivault à
			// new DaoImpl() mais qui retourne un objet de type daoImpl
			// mais sans utiliser la class sinon couplagefort
			// on utilise donc l'interface
			//// INSTANCIATION DYNAMIQUE
			IDao dao = (IDao) cDao.newInstance();
			// on test
			System.out.println(dao.getTemperature());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}

}
