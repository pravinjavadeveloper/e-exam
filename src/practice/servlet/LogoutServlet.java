package practice.servlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;



public class LogoutServlet extends HttpServlet  
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException
	{
		req.getSession().invalidate();
		String url =res.encodeRedirectURL("logout.jsp");
			res.sendRedirect(url);
	}
}
