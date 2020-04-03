package rmi;

import java.io.Serializable;

// Pour que la classe Compte soit echangé entre les application(machine) distante 
// DOIVENT ETRE SERIALIZABLE
public class Compte implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int code;
	private double solde;
	public Compte(int code, double solde) {
		super();
		this.code = code;
		this.solde = solde;
	}
	public Compte() {
		super();
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
}
