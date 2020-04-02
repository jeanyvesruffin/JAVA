import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Application4 {
	// Meme exercice mais pour la compression par ex pour des .doc 
	public static void main(String[] args) throws IOException {
		
		// en entré
		File fileDocInit = new File("file.doc");
		// Pour lire un fichier binaire on utilise un stream de 
		// communication d'entrée
		FileInputStream FichierStreamDocIn = new FileInputStream(fileDocInit);
		// exceptionnellement pour la compression on passe par un buffer
		BufferedInputStream bufferedReaderDoc = new BufferedInputStream(FichierStreamDocIn);
		
		// en sortie
		File fileDocDestination = new File("newFile.zip");
		FileOutputStream FichierStreamDocOut = new FileOutputStream(fileDocDestination);
		BufferedOutputStream bufferedReaderZip = new BufferedOutputStream(FichierStreamDocOut);
		
		// pour faire la compression
		ZipOutputStream zipOutputStream = new ZipOutputStream(bufferedReaderZip);
		// on specifie la methode de compression DEFLATED = compression standart
		zipOutputStream.setMethod(ZipOutputStream.DEFLATED);
		// generer une nouvelle entre dans le fichier
		zipOutputStream.putNextEntry(new ZipEntry(fileDocInit.getName()));
		int nombre = 0;
		//Variable representant la moyenne
		while((nombre = bufferedReaderDoc.read()) != -1 ) {
			zipOutputStream.write(nombre);
		}
		zipOutputStream.close();
		bufferedReaderDoc.close();
	}
}
