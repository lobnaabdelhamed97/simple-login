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

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserInterface uu = new UserImplementation();

		String Uname = request.getParameter("username" );
		String email = request.getParameter("email" );
		String password = request.getParameter("password");
		String contact = request.getParameter("contact");
		String address = request.getParameter("address");

		String dob = request.getParameter("DOB");
		String department =request.getParameter("department");

		Users u =new Users(email,password,Uname,dob,contact,address,department) ;
//		request.setAttribute("message", email);
//		request.getRequestDispatcher("welcome.jsp").forward(request, response);

		int flag= uu.insertUser(u);
        if(flag!= 0)
        {
        	request.setAttribute("message", u.getEmail());
    		request.getRequestDispatcher("welcome.jsp").forward(request, response);
        }
        else {
        	request.getRequestDispatcher("login.jsp").forward(request, response);	
        }
		



	}

}
