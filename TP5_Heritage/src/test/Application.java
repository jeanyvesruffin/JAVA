package test;

import figures.Cercle;
import figures.Point;

public class Application {

	public static void main(String[] args) {
		// creation d'un cercle defini par son centre c(100,100) et un point p(200,200)
		// creation d'un cercle defini par son centre c(130,100) et un rayon r(40)
		// afficher le perimetre et le rayon des deux cercles
		// afficher si le point p(120,100) appartient à l'intersection des 2 cercles ou non .
		
		
		Point p = new Point(100, 100);
		Cercle c1 = new Cercle(p, 40);
		Cercle c2 = new Cercle(new Point(130,100), new Point (200,200));
		System.out.println("Perimetre du 1er cercle :"+c1.toString()+ " est:  "+ c1.getPerimetre());
		System.out.println("Surface du 2eme cercle :"+c2.toString()+ " est:  "+ c2.getSurface());
		Point p1 = new Point(130,130);
		if((c1.appartient(p1)&&c2.appartient(p1))) {
			System.out.println(p+" appartient à l'intersectoin entre "+c1+" et "+c2);
		}else {
			System.out.println(p+" n'appartient pas l'intersectoin entre "+c1+" et "+c2);
		}
	}

}
