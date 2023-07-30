import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class ClientServlet extends HttpServlet {
 
    private static final long serialVersionUID = -2128122335811219481L;
 
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
 
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
 
        // client's IP address
        String remoteAddr = req.getRemoteAddr();
 
        // client's hostname
        String remoteHost = req.getRemoteHost();
 
        out.write("remoteAddr = ");
        out.write(remoteAddr);
        out.write("n");
        out.write("remoteHost = ");
        out.write(remoteHost);
 
        out.close();
 
    }
 
}