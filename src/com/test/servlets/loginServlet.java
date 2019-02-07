package com.test.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import login.submit.registration.UserImplementation;
import login.submit.registration.UserInterface;
import login.submit.registration.Users;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
    	super();
      }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String email = request.getParameter("email" );
		String password = request.getParameter("password" );
		
		UserInterface uu = new UserImplementation();
	
		//object from userinterface to deal with user implementation
		Users u = uu.getUsers(email, password);
	if(u==null)
	{	request.setAttribute("message", "data is not found go to register");
	request.getRequestDispatcher("login.jsp").forward(request,response);
	}
	else
	{
		request.setAttribute("message", u.getUsername());
		request.getRequestDispatcher("welcome.jsp").forward(request, response);
	}
	}

}
