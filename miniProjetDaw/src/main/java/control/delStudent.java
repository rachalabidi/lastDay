package control;
import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CUSERDAO;
@WebServlet("/SuppEtudServlet")

public class delStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 public delStudent() {
	       super();
	    }
	  
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			if (request.getSession().getAttribute("admin") != null) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/studentList.jsp");
				dispatcher.include(request, response);
			}
			
			 
		}

		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			CUSERDAO adminDAO=new CUSERDAO();
			  
			  int id = Integer.parseInt(request.getParameter("didE"));
			  if(id>0) {
			    try {
					adminDAO.SuppEtud(id);
				} catch (InstantiationException | IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			   
			   response.sendRedirect("http://localhost:8676/miniProjetDaw/studentListServlet");
			  }

	}
}
