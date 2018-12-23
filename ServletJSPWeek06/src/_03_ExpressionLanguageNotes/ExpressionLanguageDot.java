package _03_ExpressionLanguageNotes;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

@WebServlet("/employeeLanguageDot")

public class ExpressionLanguageDot extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Map<String,String> map=new HashMap<String, String>();

        map.put("key1","value 1");
        map.put("key2","value 2");
        map.put("key3","value 3");

        List<String> myList=new ArrayList<String>();
        myList.add("elma");
        myList.add("armut");
        myList.add("portakal");

        req.setAttribute("map1",map);
        req.setAttribute("myList",myList);

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("employeeLanguageDot.jsp");
        requestDispatcher.forward(req,resp);
    }
}
