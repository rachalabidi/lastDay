package control;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CUSERDAO;
import model.étudiant;

@WebServlet("/UpdateStu")

public class updateStu  extends HttpServlet{
	private static final long serialVersionUID = 1L;
	 public updateStu() {
	       super();
	    }
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			if (request.getSession().getAttribute("admin") != null) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/studentListe.jsp");
				dispatcher.include(request, response);
			} else {
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/login.jsp");
				dispatcher.include(request, response);
			}
			
			 
		}
	 

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		étudiant etu =new étudiant(request);
	//ens.setIdprof(Integer.parseInt(request.getParameter("id")));
	int id = etu.getId();
	etu.setFirstnameEtud(request.getParameter("nom"));
	etu.setLastnameEtud(request.getParameter("prenom"));
	etu.setGroupe(request.getParameter("groupe"));
	
	CUSERDAO userDAO =new CUSERDAO();
	 if(id>=0) { 
		   
	userDAO.updateEtud(etu, id);}}
			
	  catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	PrintWriter out = response.getWriter();		
	RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/updateStuJSP.jsp");
	dispatcher.include(request, response);

	out.print("<center><h2> The Student infos are  updated successfully <h2>");
	 
}
}
