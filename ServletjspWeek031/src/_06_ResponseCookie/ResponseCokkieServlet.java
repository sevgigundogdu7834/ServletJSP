package _06_ResponseCookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/responseCokkieServlet")
public class ResponseCokkieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        Cookie newCokkie=new Cookie("user","sevgi");

        resp.addCookie(newCokkie);
    }
}

// cookie ler son kullanıcının bilgisayarında saklanan( browser tarafından ) küçük bilgilerdir.

// Cookieler özel headerlardır.