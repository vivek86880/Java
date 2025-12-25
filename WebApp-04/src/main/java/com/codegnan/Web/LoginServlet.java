package com.codegnan.Web;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name=request.getParameter("uname");
		String password=request.getParameter("upwd");
		RequestDispatcher rd;
		
		if("vivek".equals(name) && "vivek123".equals(password)) {
			rd=request.getRequestDispatcher("/success.html");
			rd.forward(request, response);
		}else {
			rd=request.getRequestDispatcher("/failure.html");
			rd.forward(request, response);
		}
	}

}
