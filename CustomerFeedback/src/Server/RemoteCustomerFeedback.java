package Server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteCustomerFeedback extends Remote{

	public boolean login(String username, String password) throws RemoteException;

	
	
	
}
