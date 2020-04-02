package test;

import metier.Compte;

public class Application {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Compte c1 = new Compte(7000);
		Compte c2 = new Compte(6000);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		// La raison pour laquelle nous pouvons directement
		// avoir acces à la méthode getComptes est que la méthode est static
		// dans le cas contraire nous aurions du instancié un compte mais
		// le resultat aurait ete different car le but de static est que la valeur
		// est partagé avec tous les objets
		System.out.println("Nombre de compte :"+Compte.getNbComptes());
		//montre que la valeur est partagé
		System.out.println("Nombre de compte :"+c1.getNbComptes());
		// lecture solde et code
		System.out.println("======Compte 1======");
		System.out.println(c1.getSolde());
		System.out.println("Code compte :" +c1.getCode());
		System.out.println("====== Versement sur Compte "+c1.getCode()+" 5000 ======");
		c1.verser(5000);
		System.out.println(c1.getSolde());
		System.out.println();
		System.out.println("====== Retrait sur Compte "+c1.getCode()+" 900 ======");
		c1.retirer(900);
		System.out.println(c1.getSolde());
	}

}
