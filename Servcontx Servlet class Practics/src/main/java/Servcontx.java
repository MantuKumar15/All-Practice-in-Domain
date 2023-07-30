import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servcontx
 */
//@WebServlet("/Servcontx")
public class Servcontx extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
        response.setContentType("text/html");
        ServletConfig conf = getServletConfig();
		ServletContext cxt=getServletContext(); 
		String c1=cxt.getInitParameter("Website-name");
		String s1=cxt.getInitParameter("Course");
        String s2=cxt.getInitParameter("Sem.");
        String nm=conf.getInitParameter("Name");
        String ag=conf.getInitParameter("Age");
        String mb=conf.getInitParameter("Mobile");
       
        out.println("web site name : "+c1);out.println("<br>");
  out.println("Course name is: "+s1);out.println("<br>");
  out.println("Semester is: "+s2);
  out.println("<br><br><br>");
  out.println("  Name is: "+nm+" , Age is :"+ag+" , Mobile Number is: "+mb);
  out.println("<br><br><br>");
  out.println("<a href=Servcontx2>Go</a>");
       out.close();    
       
	}

}
