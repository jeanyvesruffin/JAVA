package test;

import a.b.c.Compte;
import a.b.c.CompteSimple;

public class App {

	public static void main(String[] args) {
		
		// Compte compte = new Compte(1,5000);
		// creation d'une classe derivé de la classe abstraite
		Compte compte = new CompteSimple(1,5000,500);
		compte.verser(5000);
		compte.retirer(3000);
		System.out.println(compte.toString());
		
	}

}
