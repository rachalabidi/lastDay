package model;
import javax.servlet.http.HttpServletRequest;

public class étudiant {
	private int id;
	private String firstnameEtud;
	private String lastnameEtud;
	private String groupe;
	
	public étudiant(){
	       super();
	    }
	
	public étudiant(HttpServletRequest request) {
		this.firstnameEtud = request.getParameter("nom");
		this.lastnameEtud = request.getParameter("prenom");
		this.groupe = request.getParameter("groupe");
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstnameEtud() {
		return firstnameEtud;
	}

	public void setFirstnameEtud(String firstnameEtud) {
		this.firstnameEtud = firstnameEtud;
	}

	public String getLastnameEtud() {
		return lastnameEtud;
	}

	public void setLastnameEtud(String lastnameEtud) {
		this.lastnameEtud = lastnameEtud;
	}

	public String getGroupe() {
		return groupe;
	}
	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}
}
