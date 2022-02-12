package model;

import javax.servlet.http.HttpServletRequest;

public class User {
	private int id;
	private String usename;
	private String password;
	private String firstname;
	private String type;
	


	public User() {
		super();
	}
	//LAMASALA7ATCH NA7ini
	public User(HttpServletRequest request) {
		this.usename = request.getParameter("nom");
		this.type = request.getParameter("Gender");
		this.password = request.getParameter("pass");
		
		
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUsename() {
		return usename;
	}

	public void setUsename(String usename) {
		this.usename = usename;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	
	

}
