package _05_urlReWrite;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/UrlReWrite")
public class UrlReWrite extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession httpSession=req.getSession();

        httpSession.setAttribute("key","object value");

        PrintWriter pw=resp.getWriter();

        String nonEncodeUrl="GetSessionAttribute";

        // encodeURL kullanmazsak cokkie kapalıysa session'ları kullanamayız!.
        // çünkü session bilgisi ( session id) bilgisi default olarak cookieler aracılığıyla taşınmaktadır.


        String encodeUrl=resp.encodeURL("GetSessionAttribute");

        // Bu şekilde encodeUrl methodunu kullandığımızda cookie browserda kapalıysa url sonuna JSESSİONİD bilgisi eklenir.
        // cookie açıksa eklenmez.

        pw.println("<html><body>");
        pw.println("Giriş - <a href =\""+ nonEncodeUrl +"\"> Click Here </a> .");
        pw.println("Giriş - <a href =\""+ encodeUrl +"\"> Click Here </a> .");
        pw.println("</body></html>");
    }
}
