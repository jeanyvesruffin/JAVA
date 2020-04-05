package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import metier.Compte;

// 1er etape

public interface IBanqueRemote extends Remote{
	// herite de remote
	// toutes les methodes doivent lever l'exception remoteException
	public double conversion(double montant) throws RemoteException;
	public Compte consulterCompte(int code) throws RemoteException;
	public List<Compte> listComptes() throws RemoteException;

}
