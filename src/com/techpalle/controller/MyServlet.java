package com.techpalle.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techpalle.dao.DataAccess;
import com.techpalle.model.Student;

@WebServlet("/srv")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	
		//Read the Data Given by User/Student
		String name=request.getParameter("tbname");
		String email=request.getParameter("tbEmail");
		String qualification=request.getParameter("tbqual");
		String password=request.getParameter("tbpass");
		//String mobile1=request.getParameter("tbMobile");
		long mobile=Long .parseLong(request.getParameter("tbMobile"));
		
		//Add above data to student object:
		Student stud=new Student(name, email, qualification, password, mobile);
		
		//Call the insertStudent method and pass the above value as input
		DataAccess.inserstudent(stud);
		//DataAccess.inserstudent(name, email, qualification, password);
		//Displaying some success message
	                                            //response.getWriter().append("<h1>Data is inserted..</h1>");//
		//redirect user to login.html page
		                                        //response.sendRedirect("login.html");
		//redirect method will only redirect to other page but will not transfer the data–
	    //redirect user to login.jsp and transfer the data from reg.html to login.jsp  
		RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
		//code to transfer the data
		rd.forward(request, response);
		
	}
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
