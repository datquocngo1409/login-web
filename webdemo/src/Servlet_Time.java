import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "Servlet_Time", urlPatterns = "/demo")
public class Servlet_Time extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<!DOCTYPE HTML>");
        writer.println("<html>");
        writer.println("<style type=\"text/css\">");
        writer.println("  .login {");
        writer.println("    height:180px; width:300px;");
        writer.println("    margin:0;");
        writer.println("    padding:10px;");
        writer.println("    border:1px #CCC solid;");
        writer.println("  }");
        writer.println("  .login input {");
        writer.println("    padding:5px; margin:5px");
        writer.println("  }");
        writer.println("</style>");
        writer.println("<body>");
        writer.println("<form method=\"post\" action=\"/login\">");
        writer.println("  <div class=\"login\">");
        writer.println("    <h2>Login</h2>");
        writer.println("    <input type=\"text\" name=\"username\" size=\"30\"  placeholder=\"username\" />");
        writer.println("    <input type=\"password\" name=\"password\" size=\"30\" placeholder=\"password\" />");
        writer.println("    <input type=\"submit\" value=\"Sign in\"/>");
        writer.println("  </div>");
        writer.println("</form>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
