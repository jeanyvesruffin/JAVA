package jeu;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class JeuImpl extends UnicastRemoteObject implements IJeuRemote {

	/**
	 * 
	 */
	private int nombreSecret;
	public boolean fin;
	private static final long serialVersionUID = 1L;

	public JeuImpl() throws RemoteException {
		super();
		genererSecret();
	}

	private void genererSecret() {
		nombreSecret = (int)(Math.random()*1000);
	}

	@Override
	public String jouer(int nombre) throws RemoteException {
		if(fin == false) {
			if(nombre>nombreSecret) {
				return "Votre nombre est trop grand";
			} else if(nombre<nombreSecret) {
				return "Votre nombre est plus petit";
			} else {
				fin = true;
				return "Bravo !!";
			}
		} else {
			return "Jeu termin� le nombre secret est :" + nombreSecret;
		}
	}
}
