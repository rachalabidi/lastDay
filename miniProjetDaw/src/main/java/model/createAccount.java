package model;

import javax.servlet.http.HttpServletRequest;

public class createAccount { // ALL ABOUT A CHIKH YA WADIIII .... HAVE FUN 
	private int idprof;
	private String nom_prof;
	private String prenom_prof;
	private String email;
	private String tel;
	private String type ;
	private String password;
	private String module;
	

	public createAccount() {
	       super();
	    }
	
	public createAccount(HttpServletRequest request) {
		this.nom_prof = request.getParameter("nom");
		this.email = request.getParameter("email");
		this.prenom_prof = request.getParameter("prenom");
		this.tel = request.getParameter("tel");
		this.type = request.getParameter("Gender");
		this.password = request.getParameter("pass");
		this.module = request.getParameter("module");
		
		
	}

	public int getIdprof() {
		return idprof;
	}

	public void setIdprof(int idprof) {
		this.idprof = idprof;
	}

	public String getNom_prof() {
		return nom_prof;
	}

	public void setNom_prof(String nom_prof) {
		this.nom_prof = nom_prof;
	}
	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}
	public String getPrenom_prof() {
		return prenom_prof;
	}

	public void setPrenom_prof(String prenom_prof) {
		this.prenom_prof = prenom_prof;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
