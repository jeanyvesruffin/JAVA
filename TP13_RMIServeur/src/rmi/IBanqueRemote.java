package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.*;

// INTERFACE REMOTE
// Remote method invocation, plus connu sous l'acronyme RMI 
// est une interface de programmation (API) pour le langage 
// Java qui permet d'appeler des méthodes distantes.


// 1er doit heriter de Remote
// 2eme doit lever l'exception Remote exception (throws )
public interface IBanqueRemote extends Remote {
	// Methode de conversion
	public double conversion(double montant) throws RemoteException;
	// Methode d'affichage
	public String test() throws RemoteException;
	// Methode  consultation compte
	public Compte consulter(int code) throws RemoteException; 
	// retourne la liste des comptes
	public List<Compte> listComptes() throws RemoteException;
	
	
	
}
