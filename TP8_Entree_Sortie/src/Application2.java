import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Application2 {

	public static void main(String[] args) throws IOException {
		File fileTxt = new File("notes.txt");
		// Pour lire un fichier on utilise FileReader
		FileReader lectureFichier = new FileReader(fileTxt);
		// Declaration d'un fichier qui sera notre copie
		File copieTxt = new File("copie.txt");
		// Pour l'ecriture
		FileWriter ecritureFichier = new FileWriter(copieTxt);
		
		int numLigne;
		while((numLigne = lectureFichier.read()) != -1) {
			// en ajoutant +1 au numLigne la copie sera crypté
			ecritureFichier.write(numLigne+1);
		}
		ecritureFichier.close();
		lectureFichier.close();
	}

}
