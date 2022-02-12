package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;
import model.UserDAO;

@WebServlet("/myServlet")
public class myServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public myServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		  // String T =request.getParameter("type");
		if (request.getSession().getAttribute("user") != null) {


			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/admin.jsp");
		dispatcher.forward(request, response);
		
		}else {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/logIn.jsp");
		dispatcher.include(request, response);
	}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher;

		String username = request.getParameter("username");
		String pass = request.getParameter("pass");
        
		UserDAO userDAO = new UserDAO();

		try {

			User user = userDAO.checkLogin(username, pass);

			if (user != null) {

				HttpSession session = request.getSession();
			    session.setAttribute("user", user);
				
			 	 if(user.getType().equals("admin")){
				dispatcher = request.getRequestDispatcher("/WEB-INF/admin.jsp");
				dispatcher.forward(request, response);
				}else if(user.getType().equals("prof")){
					 dispatcher = request.getRequestDispatcher("/WEB-INF/prof.jsp");
				 dispatcher.forward(request, response);
					} 

			}else {

				PrintWriter out = response.getWriter();

				dispatcher = request.getRequestDispatcher("/WEB-INF/logIn.jsp");
				dispatcher.include(request, response);

				out.print("<center><h3> Incorect username or password !!</h3></center>");
			}

		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		

	}

}
