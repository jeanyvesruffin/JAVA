package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class Presentation {

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
		// autre solution d'injection de dependance
		// ===> dit injection par instanciation dynamique
		// on creer un fichier de configuration config.txt
		
		// creer un metier
		MetierImpl metierImpl = new MetierImpl();
		// on associe une valeur 
		metierImpl.setDao(daoImpl);
		// puis on affiche le resultat
		System.out.println(metierImpl.calcul());
		

	}

}
