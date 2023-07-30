import javax.servlet.http.*; 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.*;


@WebServlet("/Myse")
public class Myse extends HttpServlet { 
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
         
       
        String username = request.getParameter("username");
        String password = request.getParameter("password");
         
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html> <body>");
        out.println("<h3> Your username is : " + username + "</h3><br/>");
        out.println("<h3> Your password is : " + password + "</h3>");
        out.println("</body></html>");
       
    }
 
}