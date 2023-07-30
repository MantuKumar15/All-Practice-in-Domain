    import java.io.*;
	import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
	import java.sql.*;
	@WebServlet("/MyServlet")
	public class MyServlet extends HttpServlet
	{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		Connection con;
		Statement stmt;
		ResultSet rs;
		
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			response.setContentType("text/html"); 
			PrintWriter out= response.getWriter(); 
			
			String name= request.getParameter("num");
	
	

			
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test3", "root", "");
				stmt= con.createStatement();
				
		rs=stmt.executeQuery("Select * from student2 where s_name= '"+name+"' ");
	
	
				
				if(rs.next())
				{
					out.println("<h3> Name=</h3>" +rs.getString("s_name")); // Printing Name from Database
					out.println("<br> Address=" +rs.getString("address"));  // Printing Address from Database
				}
				else
				{					out.println("<h3> ID is not exists</h3>"); // If no such ID found in Database
				}
			}
			catch(Exception e)
			{
				out.println(e);
			}
		}
	
	}
