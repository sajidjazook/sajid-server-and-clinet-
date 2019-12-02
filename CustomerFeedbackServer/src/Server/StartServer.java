package Server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class StartServer {

	public static void main(String[] args)throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Attempting to start the Question Server..."); 
		try {
			RemoteCustomerFeedback questions = new CustomerFeedbackImplementation();
			Registry reg = LocateRegistry.createRegistry(8000);
			reg.rebind("CustomerFeedback",questions);

			System.out.println("Service started. Welcome to RMI Customer Feedback Service!");

		} catch (RemoteException e) {
			System.out.println("An error occured: "+e.toString()); 
			e.printStackTrace();
		} 
	}

}
