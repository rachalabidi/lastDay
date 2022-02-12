package control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CUSERDAO;
import model.étudiant;
@WebServlet("/studentListServlet")

public class studentList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public studentList() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getSession().getAttribute("user") != null){
			
			CUSERDAO userDAOEtud = new CUSERDAO();
			
			ArrayList<étudiant> etudList = null;
			
			try {
				
				etudList = userDAOEtud.getEtudiant();
				
			} catch (InstantiationException | IllegalAccessException e) {
				
				e.printStackTrace();
			}
			
			request.setAttribute("etudList",etudList);
			

			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/studentList.jsp");
			dispatcher.include(request, response);
			
		}else {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/logIn.jsp");
			dispatcher.include(request, response);
		} 
				
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
}
