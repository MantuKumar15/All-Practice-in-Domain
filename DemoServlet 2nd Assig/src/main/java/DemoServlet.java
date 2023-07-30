import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class DemoServlet extends HttpServlet
{

 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
{
 response.setContentType("text/html");
 PrintWriter out = response.getWriter();
 out.println("<html><body>");
 out.println("<h1>hello</h1>");
 out.println("</body></html>");
 }
 
}