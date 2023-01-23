//servlet class
//servlet 1

package com.practice;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>Welcome to Register servlet</h2>");
		
		String name = request.getParameter("user_name");
		String password = request.getParameter("user_password");
		String email = request.getParameter("user_email");
		String gender = request.getParameter("user_gender");
		String course = request.getParameter("user_course");
		String cond = request.getParameter("condition");
		
		if(cond!=null)
		{
		if(cond.equals("checked"))
		{
			out.println("Name : "+name);
			out.println("<h2>Password : "+password+"</h2>");
			out.println("Email : "+email);
			out.println("Gender : "+gender);
			out.println("Course : "+course);
			
			RequestDispatcher rd = request.getRequestDispatcher("SuccessServlet");
			rd.forward(request, response);
		}
		else
		{
			out.println("you have not agreed to t and c");
		}
		}
		else
		{
			out.println("you have not agreed to t and c");
			
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
		
	}

}
