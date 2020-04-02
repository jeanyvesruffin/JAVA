package scolarite;

import java.io.Serializable;

// objet serialisable
public class Etudiant implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Attributs
	private String code;
	private String matiere;
	private transient float note;
	
	// Constructeur avec parametres
	public Etudiant(String code, String matiere, int note) {
		super();
		this.code = code;
		this.matiere = matiere;
		this.note = note;
	}
	
	// Constructeur sans parametres 
	public Etudiant() {
		super();
	}
	
	// getters && setters
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	public float getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Etudiant [code=" + code + ", matiere=" + matiere + ", note=" + note + "]";
	}
	
}
