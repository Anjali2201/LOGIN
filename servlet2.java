
package assignment1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet2 extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String search = request.getParameter("name");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servlet2</title>");
            out.println("</head>");
            out.println("<body>");

            try {
                response.sendRedirect("https://www.google.com/search?q=" + search);
            } catch (Exception e) {
                e.printStackTrace();
            }

            out.println("</body>");
            out.println("</html>");
        }
    }

}
