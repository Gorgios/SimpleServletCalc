package pl.edu.ug.tent.springweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/data")
public class DataServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    String nameFromForm = req.getParameter("imie");

    resp.setContentType("text/html");

    PrintWriter out = resp.getWriter();

    out.println("<html><body>");
    out.println("<h3>" + nameFromForm + "</h3>");
    out.println("</body></html>");
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    String nameFromForm = req.getParameter("imie");

    resp.setContentType("text/html");

    PrintWriter out = resp.getWriter();

    out.println("<html><body>");
    out.println("<h3>" + nameFromForm + "</h3>");
    out.println("</body></html>");
  }
}
