package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	private Connection connection;

	
	// connection to database
	public UserDAO() {
		this.connection = null;
	}

	// connection to database
	public void connectDB() throws InstantiationException, IllegalAccessException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mygpe", "root", "rashalabidicofy");
			System.out.println("Connection avec succes a la base de donnees !");
		} catch (ClassNotFoundException cnf) {
			System.out.print("Driver non chargé...");
		} catch (SQLException sqlex) {
			System.out.println("Incapable de connecter a la base de donnees...");
		}

	}

	// insert the object message in the database
	public User checkLogin(String username, String password)
			throws InstantiationException, IllegalAccessException {
		
		String requete;
		PreparedStatement statement;
		
		User user = null;

		try {
			
			connectDB();
			
			requete = "SELECT * FROM users WHERE username = ? and password = ?";
			statement = connection.prepareStatement(requete);
			statement.setString(1, username);
			statement.setString(2, password);
			
			ResultSet result = statement.executeQuery();			
			
	        if (result.next()) {
	            user = new User();
	           
	            user.setUsename(result.getString("username"));
	            user.setPassword(result.getString("password"));
	            user.setType(result.getString("typeuser"));
	        }
	        
			statement.close();

			System.out.println("yesss !");
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		return user;
	}

/*	public User checkLoginProf(String username, String password)
			throws InstantiationException, IllegalAccessException {
		
		String requete;
		PreparedStatement statement;
		
		User user = null;

		try {
			
			connectDB();
			
			requete = "SELECT * FROM users WHERE username = ? and password = ? and type='prof'";
			statement = connection.prepareStatement(requete);
			statement.setString(1, username);
			statement.setString(2, password);
			
			ResultSet result = statement.executeQuery();			
			
	        if (result.next()) {
	            user = new User();
	            user.setFirstname(result.getString("firstname"));
	            user.setLastname(result.getString("lastname"));
	            user.setUsename(result.getString("username"));
	            user.setPassword(result.getString("password"));
	            user.setType(result.getString("type"));
	        }
	        
			statement.close();

			System.out.println("yesss !");
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		return user;
	}*/
	
}