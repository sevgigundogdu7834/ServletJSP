package _01_getRequestParams;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;

@WebServlet("/requestPostForm")
public class RequestPostForm extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("RequestPostForm# doPost");

        String name=req.getParameter("firstName");
        String lastName=req.getParameter("lastName");
        String gender=req.getParameter("gender");
        String marital_status=req.getParameter("marital status");
        String [] lang=req.getParameterValues("lang");

        PrintWriter pw=resp.getWriter();
        pw.println(name);
        pw.println(lastName);
        pw.println(gender);
        pw.println(marital_status);
        pw.println(Arrays.asList(lang));



      Map<String,String[]> entry=req.getParameterMap();

      for(Map.Entry<String,String[]> entry1 : entry.entrySet()){

          System.out.println(entry1.getKey() + " " + Arrays.asList(entry1.getValue()));

      }



    }
}
