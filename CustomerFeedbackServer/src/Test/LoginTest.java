package Test;

import Server.CustomerFeedbackImplementation;
import Server.RemoteCustomerFeedback;

public class LoginTest {
	public void RunTest() {
		boolean Status = true;
		try {
			RemoteCustomerFeedback questions = new CustomerFeedbackImplementation();
			System.out.println("#1 - Testing Admin Login");

			System.out.print("*CASE VALID USER:");
			
			if(questions.login("sajid.pattern1@gmail.com", "12345")){
				System.out.println("Login Success!!");
			}else{
				System.out.println("Login Failed!!");
				Status=false;
			}

			System.out.print("*CASE INVALID USER:");
			if(questions.login("ajid.pattern1@gmail.com", "12345")){
				System.out.println("Login Success!!");
				Status=false;

			}else{
				System.out.println("Login Failed!!");
			}
			
	
			System.out.print("*CASE WRONG PASSWORD:");
			if(questions.login("sajid@pattern1@gmail.com", "12346")){
				System.out.println("Login Success!!");
				Status=false;

			}else{
				System.out.println("Login Failed!!");
			}
			
			if(Status){
				System.out.println("Admin Login Test Passed!!");
			}else{
				System.out.println("Admin Login Test Failed!!");
			}


		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	
}
