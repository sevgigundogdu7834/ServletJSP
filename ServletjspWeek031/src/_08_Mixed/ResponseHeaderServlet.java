package _08_Mixed;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/responseHeaderServlet1")
public class ResponseHeaderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.addHeader("username","admin");
        resp.addHeader("password","sevgi199416.");

        resp.setHeader("role","admin");
        resp.setHeader("role","role");

        PrintWriter pw=resp.getWriter();
        pw.println("Welcome to my site ......");

    }
}
