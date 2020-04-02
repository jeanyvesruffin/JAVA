package figures;

public class Cercle {
	private Point centre;
	private double rayon;
	
	public Cercle (Point centre, double rayon) {
		this.centre = centre;
		this.rayon = rayon;
	}
	public Cercle (Point centre, Point p) {
		this.centre = centre;
		// rayon calculé entre le centre et un pt du cercle 
		// x et y sont accessible car les attribut de la classe mere sont protected
		// sinon nous aurions du passé par les getters et setters
		// 1er solution pas top
//		int a =p.x -centre.x;
//		int b =p.y -centre.y;
//		this.rayon = Math.sqrt(a*a+b*b);
		this.rayon=centre.distance(p);
	}
	// pour calculer la distance il est preferable de la creer ds la class mere
	// pour la surface
	public double getSurface() {
		return Math.PI*rayon*rayon;
	}
	// pour le perimetre
	public double getPerimetre() {
		return 2*Math.PI*rayon;
	}
	public String toString() {
		return ("Cercle("+centre.x+","+centre.y+","+rayon+")");
	}
	public boolean appartient(Point p) {
		double d=centre.distance(p);
		return (d<=rayon);
	}
}
