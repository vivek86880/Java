package com.codeganan.WEB;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/WELCOME SERVLET")
public class WelcomeServlet implements Servlet{
	
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1 style='color:red' align='center'>");
		out.println("WELCOME TO FIRST SERVLET PROGRAM USING SERVLET INTERFACE</h1>");
		out.println("</body>");
		out.println("</html>");
	}


	@Override
	public ServletConfig getServletConfig() {
		
		return null;
	}

	@Override
	public String getServletInfo() {
		
		return "";
	}
	
	@Override
	public void destroy() {
		
	}
	

}
