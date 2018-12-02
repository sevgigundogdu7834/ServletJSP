package _05_responseHaeder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/responseHaederServlet")
public class ResponseHaederServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        resp.addHeader("username","admin");
        resp.addHeader("username","role");

        resp.setHeader("password","1234");
        resp.setHeader("password","12345");
    }
}

//response header bilgisi, client/browser a dönen küçük bilgilerdir. (implicit/kapalı bilgiler)