

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import scolarite.Etudiant;

public class Application6 {

	public static void main(String[] args) throws IOException, Exception {		
		File file = new File("eco.txt");
		// fichier binaire à lire === FileInputStream
		FileInputStream fileInputStream = new FileInputStream(file);
		//lire les objets
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Etudiant e1 = (Etudiant) objectInputStream.readObject();
		Etudiant e2 = (Etudiant) objectInputStream.readObject();
		System.out.println(e1);
		System.out.println(e2);
		// remarque la note sera à 0 si on met transient sur l'attribut de la classe mere
		objectInputStream.close();
		
	}

}
