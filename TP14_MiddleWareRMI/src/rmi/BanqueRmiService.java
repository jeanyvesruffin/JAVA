package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import metier.Compte;

// doit heriter de UnicastRemoteObject pour avoir un Skeleton ==> obj qui definit un petit 
// service d'ecoute pour acceder a l'obj a distance
 // on y definit l'interface
public class BanqueRmiService extends UnicastRemoteObject implements IBanqueRemote{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BanqueRmiService() throws RemoteException {
		super();
	}

	@Override
	public double conversion(double montant) throws RemoteException {
		System.out.println("Conversion du montant : " + montant);
		return montant*11.3;
	}

	@Override
	public Compte consulterCompte(int code) throws RemoteException {
		System.out.println("Consultation du compte : " + code);
		Compte compte = new Compte(code, Math.random()*9000, new Date());
		return compte;
	}

	@Override
	public List<Compte> listComptes() throws RemoteException {
		System.out.println("Consultation des comptes : ");
		List<Compte> comptes = new ArrayList<Compte>();
		comptes.add(new Compte(1, Math.random()*9000, new Date()));
		comptes.add(new Compte(2, Math.random()*9000, new Date()));
		comptes.add(new Compte(3, Math.random()*9000, new Date()));
		return comptes;
	}

}
