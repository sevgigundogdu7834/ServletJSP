package _03_attribute;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/getSessionAttributeServlet")
public class GetSessionAttributeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession httpSession1=req.getSession();

       List<String> list=(List<String>) httpSession1.getAttribute("sessionAttribute");

       PrintWriter pw=resp.getWriter();

       pw.println(list);
        pw.println("kkjekkdkj");
    }
}
