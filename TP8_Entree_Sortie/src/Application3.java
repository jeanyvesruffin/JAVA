import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Application3 {

	public static void main(String[] args) throws IOException {
		File fileTxt = new File("notes.txt");
		// Pour lire un fichier on utilise FileReader
		FileReader lectureFichier = new FileReader(fileTxt);
		// Declaration d'un BufferedReader, c'est une classe Java permettant de lire le texte d’un flux d’entrée (comme un fichier) en mettant sur le buffer de façon transparente des caractères, des tableaux, etc.
		BufferedReader bufferedReader = new BufferedReader(lectureFichier);
		// Variable representant une ligne
		String ligne;
		//Variable representant la somme
		float somme = 0;
		int nombre = 0;
		//Variable representant la moyenne
		while((ligne = bufferedReader.readLine()) != null ) {
			++nombre;
			// pour calculer, par ex, la moyenne des notes
			// On cherche à séparer les mots entre eux
			// 1er on stock chaque ligne splité dans un tableau
			//cad [0]: E1, [1]: Math, [2]: 12 ...etc
			String [] tableauDeMot = ligne.split(";");
			// note sera de type float alors que tableauDeMot contient des String
			// pour cela on convertie le String en, float a l'aide de Float.parseFloat (idem pour double : Float.parseDouble ..ect)
			float note = Float.parseFloat(tableauDeMot[2]);
			// System.out.println(tableauDeMot[2]);
			somme += note;
		}
		System.out.println("Moyenne des notes : "+ somme / nombre);
		bufferedReader.close();
	}
}
