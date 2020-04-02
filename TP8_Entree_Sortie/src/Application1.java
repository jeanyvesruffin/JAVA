import java.io.File;

// Cours sur les entrées/ sorties
public class Application1 {

	public static void main(String[] args) {
		// Declaration variable de type File initialisé au chemin c:/
		File fichier = new File("c:/");
		// Declaration variable contenu qui sera notre tableau de fichier initialiser
		// par la methode list qui Renvoie un tableau de chaînes nommant les fichiers 
		// et répertoires du répertoire indiqué par ce nom de chemin abstrait.
		String[] contenu = fichier.list();
		for(String nameFile:contenu) {
			File typeFile = new File("c:/"+nameFile);
			// Methode isDirectory return bool si le fichier est un repertoire
			if(typeFile.isDirectory()) {
				System.out.println("Repertoire :" + nameFile);
			}else {
				System.out.println("File :"+ nameFile+ ". Taille du fichier :"+ typeFile.length() + " octets");				
			}
		}


	}

}
