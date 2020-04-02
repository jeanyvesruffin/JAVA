import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import scolarite.Etudiant;

public class Application5 {

	public static void main(String[] args) throws IOException {
		// Application qui permet de creer des etudiants
		Etudiant etudiant1 = new Etudiant("E1", "Math", 12);
		Etudiant etudiant2 = new Etudiant("E2", "Math", 16);
		
		// File file = new File("eco.txt");
		// fichier binaire à ecrire === FileOutputStream
		// FileOutputStream fileOutputStream = new FileOutputStream(file);
		// autre methode stocker das un tableau d'octets
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		// utilisation de l'objet serialisé === ObjectOutputStream
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
		// enregistrer les objets
		objectOutputStream.writeObject(etudiant1);
		objectOutputStream.writeObject(etudiant2);
		// tableau de byte
		byte[] t = byteArrayOutputStream.toByteArray();
		System.out.println(t.length+ " octets");
		objectOutputStream.close();
	}

}
