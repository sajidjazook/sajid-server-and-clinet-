package Server;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerFeedbackImplementation implements RemoteCustomerFeedback {

	private static Connection con;

	public CustomerFeedbackImplementation() throws RemoteException {
		super();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/customerfeedback", "root", "");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public boolean login(String username, String password)
			throws RemoteException {
		// TODO Auto-generated method stub
		boolean result = false;
		try {

			Statement stmt = con.createStatement();
			ResultSet rs = stmt
					.executeQuery("select * from login where email = '"
							+ username + "';");

			while (rs.next()) {
				if (rs.getString("password").equalsIgnoreCase(password)) {
					result = true;
				} else {
					result = false;
				}
			}

			// con.close();
			return result;
		} catch (Exception e) {
			System.out.println(e);
			return false;

		}
	}

	@Override
	public boolean addQuestions(Question[] questions) throws RemoteException {
		// TODO Auto-generated method stub
		try {

			for (Question question : questions) {

				System.out.println(question);
				Statement stmt = con.createStatement();
				stmt.executeUpdate("INSERT INTO `questions`(`id`, `question`, `answers`, `active`) VALUES (NULL, '"
						+ question.question
						+ "', '"
						+ question.answers.toString()
						+ "', true)");

			}

			// con.close();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}

	}

	@Override
	public Question[] getQuestions() throws RemoteException {
		// TODO Auto-generated method stub
		
		try {
			Question[] questions = null ;

			Statement stmt = con.createStatement();
			ResultSet rs = stmt
					.executeQuery("SELECT * FROM `questions` WHERE `active` = true");

			while (rs.next()) {
				Question q= new Question(
						rs.getString("question"),
						rs.getString("answers"), 
						rs.getInt("id"), 
						rs.getBoolean("active"));
				
				questions[questions.length]=q;
			}
			// con.close();
			return questions;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public boolean deactivateQuestions(Question question)
			throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAnswer(Response response) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
}
