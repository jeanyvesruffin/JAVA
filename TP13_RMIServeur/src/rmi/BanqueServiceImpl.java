package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;


// Implementation de l'interface (objet distant)
// Unicast permet de definir un skeleton

// Le stub est une classe qui se situe côté client et 
// le skeleton est son homologue coté serveur

// CLIENT <===> STUB <===> NETWORK <===> SKELETON <====> SERVER

public class BanqueServiceImpl extends UnicastRemoteObject implements IBanqueRemote {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected BanqueServiceImpl() throws RemoteException {
		super();
	}

	@Override
	public double conversion(double montant) throws RemoteException {
		return montant * 11.3;
	}

	@Override
	public String test() throws RemoteException {
		return "Test";
	}

	@Override
	public Compte consulter(int code) throws RemoteException {
		return new Compte(code, Math.random()*70000);
	}

	@Override
	public List<Compte> listComptes() throws RemoteException {
		List<Compte> comptes = new ArrayList<Compte>();
		comptes.add(new Compte(1, Math.random()*70000));
		comptes.add(new Compte(2, Math.random()*70000));
		comptes.add(new Compte(3, Math.random()*70000));
		return comptes;
	}

}
