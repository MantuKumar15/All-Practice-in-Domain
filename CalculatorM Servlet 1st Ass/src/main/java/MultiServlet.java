import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MultiServlet
 */
@WebServlet("/multi")
public class MultiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("removal")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int op1=((Integer)request.getAttribute("n1")).intValue();
		int op2=((Integer)request.getAttribute("n2")).intValue();
		int result=op1*op2;
		request.setAttribute("operation","Multiplication");
		request.setAttribute("result",new Integer(result));
		RequestDispatcher rd=request.getRequestDispatcher("/resp");
		rd.forward(request,response);
	}

}
