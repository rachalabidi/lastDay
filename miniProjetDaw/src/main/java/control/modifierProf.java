package control;


import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CUSERDAO;
import model.createAccount;
@WebServlet("/Modifierprof")
public class modifierProf extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 public modifierProf() {
	       super();
	    }
	 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			if (request.getSession().getAttribute("admin") != null) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/profListe.jsp");
				dispatcher.include(request, response);
			} 
			
			 
		}


	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 CUSERDAO profDAO = new CUSERDAO();
		 int id =Integer.parseInt(request.getParameter("did"));// TANSAYACH BALIZZZ
		 createAccount ens = null;
		try {
	   ens =profDAO.selectProf(id);
	   RequestDispatcher dispatcher =request.getRequestDispatcher("/WEB-INF/admin.jsp");
		request.setAttribute("ens",ens);
		dispatcher.forward(request,response);
		
		
			
		
		
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		
	
	

	 }
	 }
