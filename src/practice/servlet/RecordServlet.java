package practice.servlet;

import practice.connection.ConnectionUtil;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.IOException;

public class RecordServlet extends HttpServlet
{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String contact=req.getParameter("con");
		String mail=req.getParameter("mail");
		String uname1=req.getParameter("uname1");
		String pass1=req.getParameter("pass1");

		ConnectionUtil cu = new ConnectionUtil();

		Connection  con = cu.getConnection();
		 String query = "insert into login values('"+uname1+"','"+pass1+"','"+contact+"','"+fname+"','"+lname+"','"+mail+"'); ";
		 try
		{
		 Statement stmt=con.createStatement();
		 stmt.executeUpdate(query); 
		}
		catch(SQLException sq)
		{
			sq.printStackTrace();
		}
		try
		{
		String log =res.encodeRedirectURL("login.jsp");
			res.sendRedirect(log);
		}
		catch(IOException io)
		{
			io.printStackTrace();
		}

	}
}