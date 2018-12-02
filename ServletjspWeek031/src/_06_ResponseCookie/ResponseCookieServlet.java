package _06_ResponseCookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/responseCookieservlet")
public class ResponseCookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cookie[] cookies=req.getCookies();

        if(cookies != null){

            for(Cookie c:cookies){

                System.out.println(c.getName() + " " + c.getValue());
            }
        }
    }
}

// Idea-536cf7f4 73af74ad-0280-4d11-a7d6-a67eee63c569
// JSESSIONID 8F84C96124EFCFA67C868AF882191289
// user sevgi
