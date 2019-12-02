package Test;

import java.rmi.RemoteException;

import Server.CustomerFeedbackImplementation;
import Server.RemoteCustomerFeedback;

public class AddQuestions {
	public void RunTest() {
		boolean Status = true;
		try {
			RemoteCustomerFeedback questions = new CustomerFeedbackImplementation();
			System.out.println("#2 - Testing Add Questions");

			System.out.print("*CASE ALL THE DETAILS ARE PRESENT:");

			if (questions..("questionnaire"+(int)Math.floor(Math.random()*1000), q)) {
				System.out.println("Success!!");

			} else {
				System.out.println("Failed!!");
				Status=false;

			}


		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	
}
