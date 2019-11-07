package pl.edu.ug.tent.springweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {


  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    PrintWriter out  = resp.getWriter();

    resp.setContentType("text/html");

    out.println("<html><body>");

    out.println("<form action='/data' method='POST'>");
    out.println("<input type='text' name='imie'>");
    out.println("</form>");

    out.println("</body></html>");

  }
}

