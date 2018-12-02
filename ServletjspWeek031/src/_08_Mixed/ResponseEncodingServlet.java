package _08_Mixed;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/responseEncodingServlet")
public class ResponseEncodingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
//Print Writer methodundan önce kullan.

        PrintWriter pw=resp.getWriter();

        // String characterEncoding= resp.getCharacterEncoding();
        // System.out.println(characterEncoding);    // ISO-8859-1


        pw.println("<html>");
        pw.println("<head> <meta charset='UTF-8'> </head>");
        pw.println("<body>");
        pw.println("Sevgi Gündoğdu");
        pw.println("</body>");
        pw.println("</html>");
    }
}
