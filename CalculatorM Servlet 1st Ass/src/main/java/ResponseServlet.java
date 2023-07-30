import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResponseServlet
 */
@WebServlet("/resp")
public class ResponseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer result=(Integer)request.getAttribute("result");
		RequestDispatcher rd=request.getRequestDispatcher("/Home.html");
		if(result==null){
		rd.forward(request,response);
		return;
	     }
		
		
		try{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String op=(String)request.getAttribute("operation");
		out.println(op+"Result: <b>"+result.intValue()+"<b>,<br/>");
		rd.include(request,response);
		}
		catch(Exception e){};
		
		
	}

}
