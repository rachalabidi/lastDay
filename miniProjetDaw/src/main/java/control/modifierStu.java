
package control;


import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CUSERDAO;
import model.étudiant;
@WebServlet("/ModifierStu")
public class modifierStu extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 public modifierStu() {
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
		 int id =Integer.parseInt(request.getParameter("didE"));// TANSAYACH BALIZZZ
		 étudiant etu = null;
		try {
	   etu =profDAO.selectEtud(id);
	   RequestDispatcher dispatcher =request.getRequestDispatcher("/WEB-INF/admin.jsp");
		request.setAttribute("etu",etu);
		dispatcher.forward(request,response);
		
		
			
		
		
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		
	
	

	 }
	 }
