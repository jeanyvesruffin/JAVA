import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		/*
		 Pomme p = new Pomme(40);
		 // surcasting se fait implicitement
		 Fruit fruit = new Pomme(50);
		 // peut s'ecrir tel que se dit "surcasting implicite"
		 Fruit f = (Fruit)new Pomme(50);
		 // se dit sous-casting
		 ((Pomme)fruit).affichePoids();
		 // Attention leve java.lang.ClassCastException: se dit sous-casting
		 ((Orange)fruit).affichePoids();
		 // phenomene appele late binding sous -casting iplicitement par le compilateur
		 // soit ((Pomme)fruit).afficher();
		 fruit.afficher();
		 fruit = new Orange(70);
		 // soit ((Orange)fruit).afficher();
		 // TOUTE LA PUISSANCE DU POLYMORPHISME EST LA
		 fruit.afficher();
		
		// LES TABLEAUX
		// declaration tableau d'une longueur de 3
		Fruit[]fruits = new Fruit [3];
		fruits[0] = new Pomme(50);
		fruits[1] = new Orange(60);
		fruits[2] = new Pomme(90);
		
		for(int i =0; i<fruits.length; i++) {
			// test
			fruits[i].afficher();
			// grace au fait que la methode est abstraite
			fruits[i].affichePoids();
			
			// pas utile car polymorphysme resoud le prb
			if(fruits[i] instanceof Pomme) {
				((Pomme)fruits[i]).affichePoids();
			} else if(fruits[i] instanceof Orange) {
				((Orange)fruits[i]).affichePoids();
			}
		 // Une collection est un tableau dynamique ou l'on stock des objets
		 // bien plus puissant qu'un tableau
		 } */
		
		 
		// LES COLLECTION ARRAYLIST
		ArrayList<Fruit> fruits = new ArrayList<Fruit>();
		// ajouter un element
		fruits.add(new Pomme(60));
		fruits.add(new Orange(30));
		fruits.add(new Pomme(80));
		fruits.add(new Pomme(10));
		// supprimer un element
		
		// pour atteindre un element d'une collection on utilise get()
		//parcourir une collection
		// for "classic"
		for(int i=0;i<fruits.size();i++) {
			fruits.get(i).afficher();
		}
		// foreach
		for(Fruit f:fruits) {
			f.afficher();
		}
		
		
	}

}
