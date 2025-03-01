package app;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class QuoteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Quote</title></head>");
        out.println("<body>");
        out.println("<h1 style='font-size: 32px; text-align: center;'>Any fool can write code that a computer can understand.</h1>");
        out.println("<h1 style='font-size: 32px; text-align: center;'>Good programmers write code that humans can understand.</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
