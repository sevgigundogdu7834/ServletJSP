package _05_Mixed;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;

@WebServlet("/annotationServlet2")
public class SecondServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter pw=resp.getWriter();

        Date date=new Date();
        DateFormat df=DateFormat.getInstance();

        String message="Merhaba Nasılsınız";
        pw.print("<html><body>");
        pw.print("<h1>" + df.format(date)+ "</h1>");
        pw.print("<h1>" + message+ "</h1>");
        pw.print("</body></html>");
    }
}
