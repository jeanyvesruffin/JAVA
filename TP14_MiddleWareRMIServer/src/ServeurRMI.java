import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import rmi.BanqueRmiService;

public class ServeurRMI {

	// ATTENTION : il faut tjrs demarrer l'annuaire LocateRegistry.createRegistry(port)
	// avant de pouvoir publier ou l'utiliser
	public static void main(String[] args) {
		
		try {
			
			// demarrage de l'annuaire rmi
			LocateRegistry.createRegistry(1099);
			// Creation de l'obj distant
			BanqueRmiService objetRmi = new BanqueRmiService();
			System.out.println(objetRmi.toString());
			// syso ==> BanqueRmiService[UnicastServerRef [liveRef: [endpoint:[192.168.1.32:62700](local),objID:[-34007176:17144b33517:-7fff, -3723405320666260207]]]]
			// publication de ca reference dans l'annuaire
			Naming.rebind("rmi://localhost:1099/BK", objetRmi);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
