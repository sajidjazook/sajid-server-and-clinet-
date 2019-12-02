package Test;

import java.rmi.RemoteException;

import Server.CustomerFeedbackImplementation;
import Server.Question;
import Server.RemoteCustomerFeedback;

public class AddQuestions {
	public void RunTest() {
		boolean Status = true;
		try {
			RemoteCustomerFeedback questions = new CustomerFeedbackImplementation();
			System.out.println("#2 - Testing Add Questions");

			System.out.print("*CASE ALL THE DETAILS ARE PRESENT:");

			//creating a set of answer samples to test
			String answers = "bad,good,best";
			
			//creating a single instance of question
			Question q= new Question("how r u?", answers, 0, true);
			
			//adding two instances of the question to the questionArray
			Question[] questionArray= {q,q};
		
			if (questions.addQuestions(questionArray)) {
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
