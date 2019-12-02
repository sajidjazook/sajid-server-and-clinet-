package Test;

import Server.CustomerFeedbackImplementation;
import Server.Question;
import Server.RemoteCustomerFeedback;

public class GetQuestionsTest {
	public void RunTest() {
		boolean Status = true;
		try {
			RemoteCustomerFeedback questions = new CustomerFeedbackImplementation();
			System.out.println("#3 - Testing Add Questions");

			System.out.print("*CASE ALL THE DETAILS ARE PRESENT:");

		
			Question[] qs= questions.getQuestions();
			if (qs.length!=0) {
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
