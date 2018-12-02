package _08_Mixed;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/requestSite")
public class RequestSite extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String name=req.getParameter("login");
        String password=req.getParameter(" password");

        PrintWriter pw=resp.getWriter();
        pw.println(name + " " +password);

    }
}
