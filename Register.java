package com.yash.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String id,ps,nm,ct,st,mo,em,in,dt;
			
			
			id=request.getParameter("id");
			ps=request.getParameter("ps");
			nm=request.getParameter("nm");
			ct=request.getParameter("ct");
			st=request.getParameter("st");
			mo=request.getParameter("mo");
			em=request.getParameter("eml");
			in=request.getParameter("in");
			dt=request.getParameter("dt");
			
			//out.println("Enter Data is stored");
			Connection con;
			PreparedStatement pst;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/users?user=root&password=yash");
			    pst=con.prepareStatement("insert into students values(?,?,?,?,?,?,?,?,?);");
			    pst.setString(1, id);
			    pst.setString(2, ps);
			    pst.setString(3, nm);
			    pst.setString(4, ct);
			    pst.setString(5, st);
			    pst.setString(6, mo);
			    pst.setString(7, em);
			    pst.setString(8, in);
			    pst.setString(9, dt);
			    pst.executeUpdate();
			    out.println("Stored in database");
			    con.close();
			}
			catch(Exception e)
			{
			out.println(e);	
			}
			
	   }
	}
}
