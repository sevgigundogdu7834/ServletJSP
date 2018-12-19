package _03_attribute;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/sessionAttributeServlet")
public class SessionAttributeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession httpSession=req.getSession();

        List<String> myList=new ArrayList<>();
        myList.add("value 1");
        myList.add("value 2");

        httpSession.setAttribute("sessionAttribute",myList);
    }
}
