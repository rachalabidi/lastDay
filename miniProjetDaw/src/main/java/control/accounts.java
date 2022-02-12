package control;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CUSERDAO;
import model.User;
import model.createAccount;
@WebServlet("/accounts")

public class accounts extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	public accounts() {
	       super();
	    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 this.getServletContext().getRequestDispatcher("/WEB-INF/createProf.jsp").forward(request,response);
		 
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//create a new ACCOUNT
		createAccount myAcc = new createAccount(request);
		
		try {
			
		//insert THE ACCOUNT in the db 
			CUSERDAO myAccDAO = new CUSERDAO();
			myAccDAO.createAccount(myAcc);
			    
			
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		//addUser
		User UseA = new User(request);
				
				try {
					
				//insert THE ACCOUNT in the db 
					CUSERDAO myuserDAO = new CUSERDAO();
					myuserDAO.addUser(UseA);
					    
					
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
				
				
	
		request.setAttribute("myAcc", myAcc);
		this.getServletContext().getRequestDispatcher("/WEB-INF/createProf.jsp").include(request, response);
		PrintWriter out = response.getWriter();
          out.print("<center><h3> U JUST CREATED A NEW ACCOUNTE !!</h3></center>");
		 
	}

	  
}
