package practice.servlet;

import practice.connection.ConnectionUtil;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.servlet.http.HttpSession;
//import java.io.PrintWriter;
//import java.io.IOException;

public class LoginServlet extends HttpServlet 
{

	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,java.io.IOException
	{	
		
		//res.setContentType("text/html");
		//PrintWriter out=res.getWriter();
		String uname=req.getParameter("u_name");
		String pass=req.getParameter("pass");
	

		Connection con =new ConnectionUtil().getConnection();

		String query=" select * from login where username='"+uname+"' and password='"+pass+"';";
		try
		{
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		if(rs.next())
			{
				System.out.println("Login Successful");
			//String url =res.encodeRedirectURL("loginSuccess.jsp");
			//req.setAttribute("user",uname);
			//res.sendRedirect(url);
			RequestDispatcher rd = req.getRequestDispatcher("loginSuccess.jsp"); 
			// it will not change url...
			HttpSession hs = req.getSession();
			hs.setAttribute("user",uname);
			rd.forward(req,res);
			
			//out.println("<html>hi  <h1>" +uname+"</h1>  Login Succefuly </html>");	
			}
			else
			{
					
			System.out.println("error");
			String url=res.encodeRedirectURL("login.jsp");
			res.sendRedirect(url);
			//RequestDispatcher rd = req.getRequestDispatcher("login.html");
			//rd.forward(req,res);
			//out.println("sory login unsuccessful");
			}
		}
		catch(SQLException sql)
		{
			sql.printStackTrace();
		}

		//out.flush();
		//out.close();

	  //System.out.println("user name:"+uname+" "+"paswrd"+pass);

	}
}
