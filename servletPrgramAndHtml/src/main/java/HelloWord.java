import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class HelloWord extends HttpServlet {
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public void init() throws ServletException {
   }

   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      // Set response content type
      response.setContentType("text/html");

      // Actual logic goes here.
      PrintWriter out = response.getWriter();
      out.println("<h1>" + "index.html" + "</h1>");
   }

   public void destroy() {
      // do nothing.
   }
}