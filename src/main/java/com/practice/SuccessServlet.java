//success servlet

package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SuccessServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("This is success servlet");
		out.println("<h2>Successfully registered</h2>");
	}
}
