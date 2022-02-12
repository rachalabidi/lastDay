package control;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CUSERDAO;
import model.étudiant;
@WebServlet("/accountEtud")

public class accountEtud extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	public accountEtud() {
	       super();
	    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 this.getServletContext().getRequestDispatcher("/WEB-INF/createStudent.jsp").forward(request,response);
		 
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//create a new ACCOUNT student
		étudiant myAccEtud = new étudiant(request);
		
		try {
			
		//insert THE ACCOUNT in the db 
			CUSERDAO myAccDAOETUD = new CUSERDAO();
			myAccDAOETUD.addEtud(myAccEtud);
			    
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
	
		
	
		request.setAttribute("myAccEtud", myAccEtud);
		this.getServletContext().getRequestDispatcher("/WEB-INF/createStudent.jsp").include(request, response);
		PrintWriter out = response.getWriter();
          out.print("<center><h3> U JUST CREATED A NEW ACCOUNTE !!</h3></center>");
		 
	}

	  
}
