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

}
