package com.codegnan.Web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpServletdemo_01
 */
@WebServlet(name = "HttpServletDemo_01", urlPatterns = { "/demo" })
public class HttpServletdemo_01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("Inside doGet()");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String name=request.getParameter("UNAME");
		String password=request.getParameter("UPWD");
		String email=request.getParameter("UEMAIL");
		String phone=request.getParameter("UMOBILE");
		String address=request.getParameter("UADDR");
		out.println("<html>");
		out.println("<p><b>User Name: </b>"+name+"</p>");
		out.println("<p><b>User Password: </b>"+password+"</p>");
		out.println("<p><b>User Email: </b>"+email+"</p>");
		out.println("<p><b>User Phone Number: </b>"+phone+"</p>");
		out.println("<p><b>User Address: </b>"+address+"</p>");
		out.close();
	}

}
