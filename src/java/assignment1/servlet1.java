package assignment1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*; 


public class servlet1 extends HttpServlet
{

@Override    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username=request.getParameter("un");
        String password=request.getParameter("pwd");
        

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            
        
            if(username.equals("Anjali") && password.equals("1234"))//acess data base
                
            {    out.println("<h1> Acess Granted</h1>");
                RequestDispatcher rd =request.getRequestDispatcher("/homepage.html");
               rd.forward(request,response);
            
            }
            else
            {
              out.println("<h1> Invalid Credential</h1>");
                RequestDispatcher rd1 =request.getRequestDispatcher("/index.html");
               rd1.forward(request,response);
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }
}