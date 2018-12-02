package _08_Mixed;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/responseGetSite")
public class ResponseGetSite extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("login");
        String surname=req.getParameter("password");

        PrintWriter pw=resp.getWriter();
        pw.println(name + " " +surname);

       Map<String,String[]> stringMap=req.getParameterMap();

       for(Map.Entry<String,String[]> stringEntry:stringMap.entrySet()){

           System.out.println("getKey = [" + stringEntry.getKey() + "], getValue = [" + stringEntry.getValue() + "]");
       }

    }
}
