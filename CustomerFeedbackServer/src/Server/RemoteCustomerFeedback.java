package Server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteCustomerFeedback extends Remote{

	public boolean login(String username, String password) throws RemoteException;

	public boolean addQuestions(Question []questions) throws RemoteException;
	
	public Question[] getQuestions() throws RemoteException;
	
	public boolean deactivateQuestions(Question question) throws RemoteException;

	public boolean addAnswer(Response response) throws RemoteException;
	


}
