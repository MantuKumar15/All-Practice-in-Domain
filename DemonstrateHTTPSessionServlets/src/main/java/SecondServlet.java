import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;  

@WebServlet("/SecondServlet")
  
public class SecondServlet extends HttpServlet {  
  
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request, HttpServletResponse response) { 
        try{  
  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        HttpSession session=request.getSession(false);  
        String n=(String)session.getAttribute("uname");  
        out.print("Hello "+n);  
  
        out.close();  
  
                }catch(Exception e){
                	System.out.println(e);
                }  
} 
      
  
}  