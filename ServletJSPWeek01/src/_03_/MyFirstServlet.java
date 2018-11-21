package _03_;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

public class MyFirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //BU KODU SİLİN !!!!
       // super.doGet(req, resp);

        System.out.println("MyFirstServlet # doGetmethod");

        PrintWriter pw=resp.getWriter();



        String message="Hello Servlet !!!";

        pw.print("<html><body>");
        pw.print("<h1>" + message+"</h1>");
        pw.print("<h1>" + message+"</h1>");
        pw.print("</body></html>");

    }
}



// 1) HttpServlet sınıfını extends et.

// 2) HTTP GET
//    HTTP POST

